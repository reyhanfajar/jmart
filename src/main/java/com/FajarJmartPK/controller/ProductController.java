package com.FajarJmartPK.controller;

import com.FajarJmartPK.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * FajarJmartPK
 *
 * this code are used in controlling product
 * @author Reyhan Fajar Pamenang
 * @version : 12 - 17 - 2021
 *
 */

public class ProductController implements BasicGetController {
    @com.FajarJmartPK.dbjson.JsonAutowired(value = Product.class, filepath = "data/account.json")
    public static JsonTable<Product> productTable;

    /**
     *
     * @param accountId id number
     * @param name product name
     * @param weight product weight
     * @param conditionUsed product state
     * @param price product price
     * @param discount from coupon
     * @param category product category
     * @param shipmentPlans product delivery option
     * @return the product data into Product class instance variable
     */
    @PostMapping(" /create")
        Product create
            (
                    @RequestParam int accountId,
                    @RequestParam String name,
                    @RequestParam int weight,
                    @RequestParam boolean conditionUsed,
                    @RequestParam double price,
                    @RequestParam double discount,
                    @RequestParam ProductCategory category,
                    @RequestParam byte shipmentPlans
            )
    {
        return new Product(accountId, name, weight, conditionUsed, price, discount, category, shipmentPlans);
    }

    /**
     *
     * @param id store id
     * @param page how many page
     * @param pageSize how many product are contained in each page
     * @return
     */
    @GetMapping("/{id}/store")
        List<Product> getProductByStore
            (
                    @PathVariable int id,
                    @RequestParam int page,
                    @RequestParam int pageSize
            )
    {
        return null;
    }

    /**
     *
     * @param page how many page after filtered
     * @param pageSize how many product that already filtered in each page
     * @param accountId id account
     * @param search search parameter, to be filtered then
     * @param minPrice min price of filtered
     * @param maxPrice max price of filtered
     * @param category product category
     * @return after product filtered
     */
    @GetMapping("/getFiltered")
        List<Product> getProductFiltered
            (
                    @RequestParam int page,
                    @RequestParam int pageSize,
                    @RequestParam int accountId,
                    @RequestParam String search,
                    @RequestParam int minPrice,
                    @RequestParam int maxPrice,
                    @RequestParam ProductCategory category
            )
    {
        return null;
    }

    /**
     *
     * @return get product table
     */
    @Override
    public JsonTable<Product> getJsonTable(){
        return productTable;
    }
}
