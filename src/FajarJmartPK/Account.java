package FajarJmartPK;

import java.util.regex.Pattern;

public class Account extends Recognizable{

    public static final String REGEX_EMAIL = "^[A-Za-z0-9&_*~[.]{0,1}]+@(.+)$";
    public static final String REGEX_PASSWORD = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$";
    public String name;
    public String email;
    public String password;
    
    public Account(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }

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
