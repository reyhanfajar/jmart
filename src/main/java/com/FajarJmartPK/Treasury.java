package com.FajarJmartPK;

/**
 * FajarJmartPK
 *
 * Class that calculates fee which will be added to the payment
 * @author Reyhan Fajar Pamenang
 * @version : 11 - 20 - 2021
 *
 */

public class Treasury
{
    public static final double COMMISSION_MULTIPLIER = 0.05;
    public static final double BOTTOM_PRICE = 20000.0;
    public static final double BOTTOM_FEE = 1000.0;

    /**
     *
     * @return price after added by fee and deducted with discount
     */
    public double getAdjustedPrice(){
        return getDiscountedPrice() + getAdminFee();
    }

    /**
     *
     * @return admin fee of payment
     */
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

    /**
     *
     * @return discounted price of product
     */
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
