package FajarJmartPK;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.google.gson.*;

public class Jmart {
    public List<Product> filterByCategory (List<Product> list, ProductCategory category){
        return null;
    }

    public List<Product> filterByPrice (List<Product> list, double minPrice, double maxPrice){
        return null;
    }

    public List<Product> read(String filepath) {
        return null;
    }

    public void main(String[] args) {
        try{
            List<Product> list = read("");
            List<Product> filtered = filterByPrice(list, 0.0, 20000.0);
            filtered.forEach(product -> System.out.println(product.price));
        }
        catch (Throwable t){
            t.printStackTrace();
        }
    }

    /*    class Country{
        public String name;
        public int population;
        public List<String> listOfStates;
    }

    public static void main(String[] args) {
        String filepath = "/Users/Intel/Documents/Segala siksa duniawi/main/jmart/src/city.json";
        Gson gson = new Gson();
        try{
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            Country input = gson.fromJson(br, Country.class);
            System.out.println("name : " + input.name);
            System.out.println("population : " + input.population);
            System.out.println("states : ");
            input.listOfStates.forEach(state -> System.out.println(state));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }*/
//End of gson tutorial

/*    public static Product createProduct(){
        //return new Product(1, 12456, "SWORD", 3000, false, priceTag, ProductCategory.MISCELLANEOUS, multiDuration);
        return null;
    }

    public static Coupon createCoupon(){
        //return new Coupon("Kupon", 6666, type, cut, minimum);
        return null;
    }
    
    public static Account createAccount(){
        //return new Account(4869, "Fajar", "fajar4646@gmail.com", "Xxxxxxx1");
        return null;
    }

    public static Complaint createComplaint(){
        //return new Complaint(4646, "Kurir lagi isi bensin");
        return null;
    }

    public static Shipment createShipment(){
        //return new Shipment("Jl.Rumahku", 50000, Duration.INSTANT, "Nge bon boleh?");
        return null;
    }

    public static Store createStore(){
        //return new Store(123, "Fajar", "Jl.In Dulu Aja", "08123456789");
        return null;
    }*/
}