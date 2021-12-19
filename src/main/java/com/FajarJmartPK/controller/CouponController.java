package com.FajarJmartPK.controller;

import com.FajarJmartPK.Algorithm;
import com.FajarJmartPK.Coupon;
import com.FajarJmartPK.JsonTable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * FajarJmartPK
 * AccountController.java
 * @author Reyhan Fajar Pamenang
 * @version : 12 - 1 - 2021
 *
 */

@RestController
public class CouponController implements BasicGetController<Coupon>{
    public static JsonTable<Coupon> couponTable;

    @GetMapping("/{id}/isUsed")
    boolean isUsed
            (
                    @PathVariable int id
            )
    {
        for(Coupon each : couponTable)
        {
            if (each.id == id) {
                return each.isUsed();
            }
        }
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
        return Algorithm.paginate(getJsonTable(), page, pageSize, pred -> pred.isUsed() == false);
    }

    @Override
    public JsonTable<Coupon> getJsonTable() {
        return couponTable;
    }
}
