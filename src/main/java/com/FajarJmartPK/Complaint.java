package com.FajarJmartPK;

import java.util.Date;

/**
 * FajarJmartPK
 *
 * This class is made for handling user complaint when using app
 * @author Reyhan Fajar Pamenang
 * @version : 11 - 20 - 2021
 *
 */

public class Complaint extends Serializable
{
    public Date date;   
    public String desc;

    /**
     *
     * @param desc of complaint that user entered
     */
    public Complaint(String desc) {
        this.desc = desc;
        this.date = new Date();
    }

    public String toString(){
        return "date=" + this.date + ", desc='" + this.desc +"'";
    }
}
