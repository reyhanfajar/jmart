package com.FajarJmartPK;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * FajarJmartPK
 *
 * This class is used for invoice of transaction
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

    /**
     * enum status
     */
    public static enum Status{
        WAITING_CONFIRMATION,
        CANCELLED,
        ON_PROGRESS,
        ON_DELIVERY,
        COMPLAINT,
        FINISHED,
        FAILED;
    }

    /**
     * enum rating
     */
    public enum Rating{
        NONE,
        BAD,
        NEUTRAL,
        GOOD;
    }

    /**
     *
     * @param buyerId id of buyer
     * @param productId id of the product
     */
    protected Invoice(int buyerId, int productId){
        this.buyerId = buyerId;
        this.productId = productId;
    }

    /**
     * Record
     */
    public class Record{
        public Date date;
        public String message;
        public Status status;
    }

    public double getTotalPay(){
        return 0.0;
    }
}
