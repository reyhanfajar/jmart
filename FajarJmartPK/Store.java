package FajarJmartPK;

import java.util.regex.Pattern;

public class Store extends Recognizable implements FileParser{

    public static String REGEX_NAME = "^\\w{4,20}$";
    public static String REGEX_PHONE = "^[0-9]{9,12}$";
    public String name;
    public String address;
    public String phoneNumber;
    
    public Store(int accountId, String name, String address, String phoneNumber){
        super(accountId);
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Store(Account account, String name, String address, String phoneNumber){
        super(account.id);
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

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

    @Override
    public boolean read(String name){
        return true;
    }

    @Override
    public Object write(){
        return null;
    }

    public String toString(){
        return "name: " + this.name + "\naddress: " + this.address 
        + "\nphone number :" + this.phoneNumber;
    }
}
