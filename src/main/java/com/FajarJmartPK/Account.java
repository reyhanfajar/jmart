package com.FajarJmartPK;

import java.util.regex.Pattern;

/**
 * FajarJmartPK
 *
 * this class is handling over Account
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

    /**
     *
     * @param name account name
     * @param email account email
     * @param password account password
     * @param balance account balance
     */
    public Account(String name, String email, String password, double balance){
        this.name = name;
        this.email = email;
        this.password = password;
        this.balance = balance;
    }

    /**
     *
     * @return if regex matches with the account data when user input them
     */
    public boolean validate(){
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        Pattern pattern2 = Pattern.compile(REGEX_PASSWORD);
        boolean matches = pattern.matcher(email).matches();
        boolean matches2 = pattern2.matcher(password).matches();
        return (matches) && (matches2);
    }

    /**
     *
     * @return String
     */
    public String toString(){
        return "name: " + this.name + "\nemail: " + this.email + "\npassword :"
        + this.password;
    }
}
