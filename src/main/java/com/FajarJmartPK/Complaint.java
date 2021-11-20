package com.FajarJmartPK;

import java.util.Date;

public class Complaint extends Serializable
{
    public Date date;   
    public String desc;

    public Complaint(String desc) {
        this.desc = desc;
        this.date = new Date();
    }

    public String toString(){
        return "date=" + this.date + ", desc='" + this.desc +"'";
    }
}
