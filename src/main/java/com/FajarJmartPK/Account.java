package com.FajarJmartPK;

import java.util.regex.Pattern;

/**
 * FajarJmartPK
 * AccountController.java
 * @author Reyhan Fajar Pamenang
 * @version : 12 - 16 - 2021
 *
 */

public class Account extends Serializable {

    public static final String REGEX_EMAIL = "^(?!.\\.{2,})(?!\\.)[0-9A-z.&~*]+@\\w+([.-]?\\w+)+$";
    public static final String REGEX_PASSWORD = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$";
    public String name;
    public String email;
    public String password;
    public Store store;
    public double balance;

    //Account ctor
    public Account(String name, String email, String password, double balance){
        this.name = name;
        this.email = email;
        this.password = password;
        this.balance = balance;
    }

    //validate method to check whether email and or password matches regex
    public boolean validate(){
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        Pattern pattern2 = Pattern.compile(REGEX_PASSWORD);
        boolean matches = pattern.matcher(email).matches();
        boolean matches2 = pattern2.matcher(password).matches();
        return (matches) && (matches2);
    }

    public String toString(){
        return "name: " + this.name + "\nemail: " + this.email + "\npassword :"
        + this.password;
    }
}
