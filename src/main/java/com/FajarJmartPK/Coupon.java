package com.FajarJmartPK;

/**
 * FajarJmartPK
 * AccountController.java
 * @author Reyhan Fajar Pamenang
 * @version : 11 - 20 - 2021
 *
 */

public class Coupon extends Serializable {
    public final String name;
    public final int code;
    public final double cut;
    public final Type type;
    public final double minimum;
    private boolean used;

    public enum Type{
        DISCOUNT,
        REBATE
    }

    //coupon ctor
    public Coupon(String name, int code, Type type, double cut, double minimum){
        this.name = name;
        this.code = code;
        this.type = type;
        this.cut = cut;
        this.minimum = minimum;
        this.used = false;
    }
    
    public boolean isUsed(){
        return used;
    }

    public boolean read(String name){
        return false;
    }
}
