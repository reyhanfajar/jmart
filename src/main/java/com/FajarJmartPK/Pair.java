package com.FajarJmartPK;

/**
 * FajarJmartPK
 * AccountController.java
 * @author Reyhan Fajar Pamenang
 * @version : 11 - 20 - 2021
 *
 */

public class Pair <T,U>{
    T first;
    U second;

    //Pair empty
    public Pair() {

    }

    //Pair ctor
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}
