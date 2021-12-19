package com.FajarJmartPK;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.FajarJmartPK.dbjson.JsonDBEngine;

import com.google.gson.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

/**
 * FajarJmartPK
 * AccountController.java
 * @author Reyhan Fajar Pamenang
 * @version : 12 - 15 - 2021
 *
 */

@SpringBootApplication
public class Jmart {
    public static long DELIVERED_LIMIT_MS = 100;
    public static long ON_DELIVERY_LIMIT_MS = 100;
    public static long ON_PROGRESS_LIMIT_MS = 100;
    public static long WAITING_CONF_LIMIT_MS = 100;

    public static List<Product> filterByAccountId (List<Product>list, int accountId, int page, int pageSize){
        return null;
    }

    public static List<Product> filterByName (List<Product>list, String search, int page, int pageSize){
        return null;
    }

    public static List<Product> filterByCategory (List<Product>list, ProductCategory category){
        List<Product> filList = new ArrayList<Product>();
        for (Product prod : list) {
            if (prod.category.equals(category)) {
                filList.add(prod);
            }
        }
        return filList;
    }

    public static List<Product> filterByPrice (List<Product>list, double minPrice, double maxPrice){
        List<Product> filList = new ArrayList<Product>();
        for (Product product : filList) {
            if(minPrice <= 0.0 && product.price < minPrice) {
                continue;
            }
            if(maxPrice <= 0.0 && product.price > maxPrice) {
                continue;
            }
            filList.add(product);
        }
        return filList;
    }
    
    public static boolean paymentTimekeeper(Payment payment){
        return false;
    }

    public static void main(String[] args) {
        JsonDBEngine.Run(Jmart.class);
        SpringApplication.run(Jmart.class, args);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> JsonDBEngine.join()));
    }
}