package com.FajarJmartPK;

 

public class Treasury
{
    public static final double COMMISSION_MULTIPLIER = 0.05;
    public static final double BOTTOM_PRICE = 20000.0;
    public static final double BOTTOM_FEE = 1000.0;

    public double getAdjustedPrice(){
        return getDiscountedPrice() + getAdminFee();
    }

    public double getAdminFee(){
        double discountedPrice = getDiscountedPrice();
        if(discountedPrice<BOTTOM_PRICE){
            return BOTTOM_FEE;
        }
        else{
            return (COMMISSION_MULTIPLIER*discountedPrice);
        }
    }
    public double discount;
    public double price;

    private double getDiscountedPrice(){
        if(discount>=100.0){
            return 0.0;
        }
        else{
            double cut = price*discount/100.0;
            return price-cut;
        }
    }
}
