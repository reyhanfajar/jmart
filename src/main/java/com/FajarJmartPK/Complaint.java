package com.FajarJmartPK;

import java.util.Date;

/**
 * FajarJmartPK
 * AccountController.java
 * @author Reyhan Fajar Pamenang
 * @version : 11 - 20 - 2021
 *
 */

public class Complaint extends Serializable
{
    public Date date;   
    public String desc;

    //complaint ctor
    public Complaint(String desc) {
        this.desc = desc;
        this.date = new Date();
    }

    public String toString(){
        return "date=" + this.date + ", desc='" + this.desc +"'";
    }
}
