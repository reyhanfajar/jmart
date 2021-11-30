package com.FajarJmartPK.controller;

import com.FajarJmartPK.Coupon;
import com.FajarJmartPK.JsonTable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class CouponController implements BasicGetController{
    @com.FajarJmartPK.dbjson.JsonAutowired(value = Coupon.class, filepath = "data/account.json")
    public static JsonTable<Coupon> couponTable;

    @GetMapping("/{id}/isUsed")
    boolean isUsed
            (
                    @PathVariable int id
            )
    {
        return false;
    }

    @GetMapping("/{id}/canApply")
    boolean canApply
            (
                    @PathVariable int id,
                    @RequestParam double price,
                    @RequestParam double discount
            )
    {
        return false;
    }

    @GetMapping("/getAvailable")
    List<Coupon> getAvailable
            (
                    @RequestParam int page,
                    @RequestParam int pageSize
            )
    {
        return null;
    }

    @Override
    public JsonTable<Coupon> getJsonTable() {
        return couponTable;
    }
}
