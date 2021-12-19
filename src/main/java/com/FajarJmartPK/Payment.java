package com.FajarJmartPK;

import java.util.ArrayList;
import java.util.Date;

/**
 * FajarJmartPK
 *
 * Class which handle Payment
 * @author Reyhan Fajar Pamenang
 * @version : 12 - 15 - 2021
 *
 */

public class Payment extends Invoice
{
    public ArrayList<Record> history = new ArrayList<Record>();
    public Shipment shipment;
    public int productCount;

    /**
     *
     * @param buyerId buyer id
     * @param productId product id
     * @param productCount how many product
     * @param shipment Shipment variable
     */
    public Payment(int buyerId, int productId, int productCount, Shipment shipment){
        super(buyerId, productId); //from Invoice
        this.productCount = productCount;
        this.shipment = shipment;
    }

    /**
     *
     * @param product variable of Product
     * @return total price to paid by buyer
     */
    public double getTotalPay(Product product){
        return (product.price-((product.discount/100)*product.price)*productCount) + shipment.cost;
    }

    public static class Record{
        public final Date date = new Date();
        public String message;
        public Status status;

        /**
         *
         * @param status variable of Status
         * @param message of Record
         */
        public Record(Status status, String message){
            this.status = status;
            this.message = message;
        }
    }
}
