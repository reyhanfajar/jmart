package com.FajarJmartPK;

/**
 * FajarJmartPK
 *
 * Class that responsible for top up
 * @author Reyhan Fajar Pamenang
 * @version : 11 - 20 - 2021
 *
 */

public class PhoneTopUp extends Invoice{
    public String phoneNumber;
    public Status status;

    /**
     *
     * @param buyerId id buyer
     * @param productId product id
     * @param phoneNumber buyer phone number
     */
    public PhoneTopUp(int buyerId, int productId, String phoneNumber) {
        super(buyerId, productId); //from Invoice
        this.phoneNumber = phoneNumber;
    }

    public double getTotalPay(Product product){
        return productId;
    }
}
