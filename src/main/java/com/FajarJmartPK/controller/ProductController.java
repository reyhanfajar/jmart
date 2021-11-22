package com.FajarJmartPK.controller;

import ch.qos.logback.classic.helpers.MDCInsertingServletFilter;
import com.FajarJmartPK.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class ProductController implements BasicGetController {
    @jmart.goldenSample.dbjson.JsonAutowired(value = Product.class, filepath = "data/account.json")
    public static JsonTable<Product> productTable;

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

    @Override
    public JsonTable<Product> getJsonTable(){
        return productTable;
    }
}
