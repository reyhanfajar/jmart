package com.FajarJmartPK.controller;

import com.FajarJmartPK.Algorithm;
import com.FajarJmartPK.Coupon;
import com.FajarJmartPK.JsonTable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * FajarJmartPK
 *
 * This class is required to controlling coupon
 * @author Reyhan Fajar Pamenang
 * @version : 12 - 1 - 2021
 *
 */

@RestController
public class CouponController implements BasicGetController<Coupon>{
    public static JsonTable<Coupon> couponTable;

    /**
     *
     * @param id
     * @return is the coupon being used or not
     */
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

    /**
     *
     * @param id
     * @param price of the product
     * @param discount of the coupon
     * @return
     */
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

    /**
     *
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping("/getAvailable")
    List<Coupon> getAvailable
            (
                    @RequestParam int page,
                    @RequestParam int pageSize
            )
    {
        return Algorithm.paginate(getJsonTable(), page, pageSize, pred -> pred.isUsed() == false);
    }

    /**
     *
     * @return couponTable
     */
    @Override
    public JsonTable<Coupon> getJsonTable() {
        return couponTable;
    }
}
