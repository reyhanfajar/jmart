package com.FajarJmartPK;

import java.util.ArrayList;
import java.util.Date;

/**
 * FajarJmartPK
 * AccountController.java
 * @author Reyhan Fajar Pamenang
 * @version : 12 - 15 - 2021
 *
 */

public class Payment extends Invoice
{
    public ArrayList<Record> history = new ArrayList<Record>();
    public Shipment shipment;
    public int productCount;

    //Payment ctor
    public Payment(int buyerId, int productId, int productCount, Shipment shipment){
        super(buyerId, productId); //from Invoice
        this.productCount = productCount;
        this.shipment = shipment;
    }

    //method to calculate total payment
    public double getTotalPay(Product product){
        return (product.price-((product.discount/100)*product.price)*productCount) + shipment.cost;
    }

    public static class Record{
        public final Date date = new Date();
        public String message;
        public Status status;

        //Record ctor
        public Record(Status status, String message){
            this.status = status;
            this.message = message;
        }
    }
}
