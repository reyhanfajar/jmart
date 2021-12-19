package com.FajarJmartPK;

/**
 * FajarJmartPK
 * AccountController.java
 * @author Reyhan Fajar Pamenang
 * @version : 11 - 20 - 2021
 *
 */

public class PhoneTopUp extends Invoice{
    public String phoneNumber;
    public Status status;

    //PhoneTopUp ctor
    public PhoneTopUp(int buyerId, int productId, String phoneNumber) {
        super(buyerId, productId); //from Invoice
        this.phoneNumber = phoneNumber;
    }

    public double getTotalPay(Product product){
        return productId;
    }
}
