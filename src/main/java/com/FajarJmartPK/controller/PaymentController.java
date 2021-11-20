package com.FajarJmartPK.controller;

import com.FajarJmartPK.JsonTable;
import com.FajarJmartPK.ObjectPoolThread;
import com.FajarJmartPK.Payment;
import com.FajarJmartPK.Shipment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class PaymentController implements BasicGetController<Payment>{
    public static final long DELIVERED_LIMIT_MS = 100;
    public static final long ON_DELIVERY_LIMIT_MS = 100;
    public static final long ON_PROGRESS_LIMIT_MS = 100;
    public static final long WAITING_CONF_LIMIT_MS = 100;
    public static JsonTable<Payment> paymentTable;
    public static ObjectPoolThread<Payment> poolThread;

    @PostMapping("/create")
    Payment create
            (
                    @RequestParam int buyerId,
                    @RequestParam int productId,
                    @RequestParam int productCount,
                    @RequestParam String shipmentAddress,
                    @RequestParam byte shipmentPlan
            )
    {
        return null;
    }


    @PostMapping("/{id}/accept")
    boolean accept
            (
                    @PathVariable int id
            )
    {
        return false;
    }

    @PostMapping("/{id}/cancel")
    boolean cancel
            (
                    @PathVariable int id
            )
    {
        return false;
    }

    @PostMapping("/{id}/submit")
    boolean submit
            (
                    @PathVariable int id
            )
    {
        return false;
    }

    protected static boolean timekeeper(Payment payment){
        return false;
    }

    @Override
    public JsonTable<Payment> getJsonTable() {
        return null;
    }
}
