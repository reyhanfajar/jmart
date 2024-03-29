package com.FajarJmartPK;

import java.util.regex.Pattern;

/**
 * FajarJmartPK
 *
 * Class that holds information of Store
 * @author Reyhan Fajar Pamenang
 * @version : 12 - 1 - 2021
 *
 */

public class Store extends Serializable {

    public static String REGEX_NAME = "^\\w{4,20}$";
    public static String REGEX_PHONE = "^[0-9]{9,12}$";
    public String name;
    public String address;
    public String phoneNumber;
    public double balance;

    /**
     *
     * @param name store name
     * @param address store address
     * @param phoneNumber store phone number
     * @param balance store balance
     */
    public Store(String name, String address, String phoneNumber, double balance){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    /**
     *
     * @return whether name and or phone number matches regex
     */
    public boolean validate(){
        Pattern pattern = Pattern.compile(REGEX_PHONE);
        Pattern pattern2 = Pattern.compile(REGEX_NAME);
        boolean matches = pattern.matcher(name).matches();
        boolean matches2 = pattern2.matcher(phoneNumber).matches();
        if((matches == true)&&(matches2 == true)){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return "name: " + this.name + "\naddress: " + this.address 
        + "\nphone number :" + this.phoneNumber;
    }
}
