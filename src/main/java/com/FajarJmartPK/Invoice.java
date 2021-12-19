package com.FajarJmartPK;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * FajarJmartPK
 * AccountController.java
 * @author Reyhan Fajar Pamenang
 * @version : 11 - 20 - 2021
 *
 */

public abstract class Invoice extends Serializable {

    Date myDate = new Date();
    SimpleDateFormat mdyFormat = new SimpleDateFormat("MM-dd-yyyy");

    public int buyerId;
    public int complaintId;
    public final String date = mdyFormat.format(myDate);
    public int productId;
    public Rating rating;

    //status enum
    public static enum Status{
        WAITING_CONFIRMATION,
        CANCELLED,
        ON_PROGRESS,
        ON_DELIVERY,
        COMPLAINT,
        FINISHED,
        FAILED;
    }

    //rating enum
    public enum Rating{
        NONE,
        BAD,
        NEUTRAL,
        GOOD;
    }

    //invoice ctor
    protected Invoice(int buyerId, int productId){
        this.buyerId = buyerId;
        this.productId = productId;
    }

    public class Record{
        public Date date;
        public String message;
        public Status status;
    }

    public double getTotalPay(){
        return 0.0;
    }
}
