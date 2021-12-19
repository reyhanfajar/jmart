package com.FajarJmartPK;

/**
 * FajarJmartPK
 * AccountController.java
 * @author Reyhan Fajar Pamenang
 * @version : 11 - 20 - 2021
 *
 */

public class ProductRating
{
    private long total;
    private long count;

    //ProductRating ctor
    public ProductRating(){
        total=0;
        count=0;
    }

    //insert to add count and rating
    public void insert(int rating){
        total+=rating;
        count++;
    }

    //average of rating
    public double getAverage(){
        if(count==0){
            return 0.0;
        }
        else{
            return (double) total/count;
        }
    }

    public long getCount(){
        return count;
    }

    public long getTotal(){
        return total;
    }
}
