package com.FajarJmartPK.controller;

import com.FajarJmartPK.*;
import com.FajarJmartPK.dbjson.JsonAutowired;
import org.springframework.web.bind.annotation.*;

/**
 * FajarJmartPK
 *
 * this class is essential to control over payment
 * @author Reyhan Fajar Pamenang
 * @version : 12 - 15 - 2021
 *
 */

@RestController
@RequestMapping("/payment")
public class PaymentController implements BasicGetController<Payment>{

    public static final long DELIVERED_LIMIT_MS = 1000;
    public static final long ON_DELIVERY_LIMIT_MS = 1000;
    public static final long ON_PROGRESS_LIMIT_MS = 1000;
    public static final long WAITING_CONF_LIMIT_MS = 1000;
    public static ObjectPoolThread<Payment> poolThread;

    @JsonAutowired(value = Payment.class, filepath = "Users/Intel/Documents/Segala siksa duniawi/main/jmart/src.payment.json")
    public static JsonTable<Payment> paymentTable;

    /**
     *
     * @return payment table
     */
    public JsonTable<Payment> getJsonTable()
    {
        return paymentTable;
    }

    /**
     * to check if the product were intact with delivery time
     * @param payment of Payment class
     * @return is the delivery on time or not
     */
    protected static boolean timekeeper(Payment payment)
    {
        Payment.Record record = payment.history.get(payment.history.size()-1);
        long start = record.date.getTime();
        long finish = System.nanoTime();
        long elapsed = finish - start;

        if (record.status == Invoice.Status.WAITING_CONFIRMATION && elapsed > WAITING_CONF_LIMIT_MS)
        {
            Payment.Record newRecord = new Payment.Record(Invoice.Status.FAILED,"FAILED");
            payment.history.add(newRecord);
            return true;
        }
        else if(record.status == Invoice.Status.ON_PROGRESS && elapsed > ON_PROGRESS_LIMIT_MS)
        {
            Payment.Record newRecord = new Payment.Record(Invoice.Status.FAILED,"FAILED");
            payment.history.add(newRecord);
            return true;
        }
        else if(record.status == Invoice.Status.ON_DELIVERY && elapsed > ON_DELIVERY_LIMIT_MS)
        {
            Payment.Record newRecord = new Payment.Record(Invoice.Status.ON_DELIVERY,"ON DELIVERY");
            payment.history.add(newRecord);
            return false;
        }
        else if(record.status == Invoice.Status.FINISHED && elapsed > DELIVERED_LIMIT_MS)
        {
            Payment.Record newRecord = new Payment.Record(Invoice.Status.FINISHED,"DELIVERED");
            payment.history.add(newRecord);
            return true;
        }
        else
        {
            return false;
        }
    }

    @PostMapping("/create")
    Payment create
            (@RequestParam int buyerId,
             @RequestParam int productId,
             @RequestParam int productCount,
             @RequestParam String shipmentAddress,
             @RequestParam byte shipmentPlan
            )
    {
        Account acc = Algorithm.<Account>find(AccountController.accountTable, e->e.id == buyerId);
        Product prod = Algorithm.<Product>find(ProductController.productTable, e->e.id == productId);

        if(acc != null && prod != null) {
            Payment payment = new Payment(buyerId, productId, productCount, new Shipment(shipmentAddress,0,shipmentPlan, null));
            double total = payment.getTotalPay(prod);

            if(acc.balance >= total){
                acc.balance -= total;
                Payment.Record record = new Payment.Record(Invoice.Status.WAITING_CONFIRMATION, "WAITING CONFIRMATION");
                payment.history.add(record);
                paymentTable.add(payment);
                poolThread.add(payment);
                return payment;
            } else {
                return null;
            }
        }
        else
        {
            return null;
        }
    }

    @PostMapping("/{id}/accept")
    boolean accept(@PathVariable int id)
    {
        Payment payment = Algorithm.<Payment>find(getJsonTable(), e->e.id == id);
        if(payment!=null && payment.history.get(payment.history.size()-1).status.equals(Invoice.Status.WAITING_CONFIRMATION))
        {
            Payment.Record newRecord = new Payment.Record(Invoice.Status.ON_PROGRESS,"ON PROGRESS");
            payment.history.add(newRecord);
            return true;
        }
        return false;
    }

    @PostMapping("/{id}/cancel")
    boolean cancel(@PathVariable int id)
    {
        Payment payment = Algorithm.<Payment>find(getJsonTable(), e->e.id == id);
        if(payment!=null && payment.history.get(payment.history.size()-1).status.equals(Invoice.Status.WAITING_CONFIRMATION))
        {
            Payment.Record newRecord = new Payment.Record(Invoice.Status.CANCELLED,"CANCELLED");
            payment.history.add(newRecord);
            return true;
        }
        return false;
    }

    @PostMapping("/{id}/submit")
    boolean submit
            (@PathVariable int id,
             @RequestParam String receipt
            )
    {
        Payment payment = Algorithm.<Payment>find(getJsonTable(), e->e.id == id);
        if(payment!=null && payment.history.get(payment.history.size()-1).status.equals(Invoice.Status.ON_PROGRESS) && !payment.shipment.receipt.isBlank())
        {
            payment.shipment.receipt = receipt;
            Payment.Record newRecord = new Payment.Record(Invoice.Status.ON_DELIVERY,"ON DELIVERY");
            payment.history.add(newRecord);
            return true;
        }
        return false;
    }
}
