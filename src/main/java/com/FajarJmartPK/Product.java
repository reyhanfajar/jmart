package com.FajarJmartPK;

/**
 * FajarJmartPK
 * AccountController.java
 * @author Reyhan Fajar Pamenang
 * @version : 11 - 20 - 2021
 *
 */

public class Product extends Serializable
{

    public int accountId;
    public double discount;
    public double price;
    public String name;
    public int weight;
    public boolean conditionUsed;
    public ProductCategory category;
    public byte shipmentPlans;

    /**
     *
     * @param accountId id account
     * @param name product name
     * @param weight product weight
     * @param conditionUsed product status
     * @param price product price
     * @param discount product discount
     * @param category product category
     * @param shipmentPlans which way buyer want the product to be sent
     */
    public Product(int accountId, String name, int weight, boolean conditionUsed, double price, double discount,
    ProductCategory category, byte shipmentPlans){
        this.accountId = accountId;
        this.name = name;
        this.weight = weight;
        this.conditionUsed = conditionUsed;
        this.price = price;
        this.discount = discount;
        this.category = category;
        this.shipmentPlans = shipmentPlans;
    }

    public String toString(){
        return "\naccountId: " + this.accountId + "\nname: " + this.name + "\nweight: " + this.weight + "\nconditionUsed: "
        + "\nprice: " + this.price + "\ndiscount: " + this.discount + "\nconditionUsed: "
        + this.conditionUsed + "\nCategory: " + this.category;
    }
}
