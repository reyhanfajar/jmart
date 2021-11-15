package FajarJmartPK;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.*;

public class Jmart {
    public static long DELIVERED_LIMIT_MS;
    public static long ON_DELIVERY_LIMIT_MS;
    public static long ON_PROGRESS_LIMIT_MS;
    public static long WAITING_CONF_LIMIT_MS;

    public static List<Product> filterByAccountId (List<Product>list, int accountId, int page, int pageSize){
        return null;
    }

    public static List<Product> filterByName (List<Product>list, String search, int page, int pageSize){
        return null;
    }

    public static List<Product> filterByCategory (List<Product>list, ProductCategory category){
        List<Product> filList = new ArrayList<Product>();
        for (Product prod : list) {
            if (prod.category.equals(category)) {
                filList.add(prod);
            }
        }
        return filList;
    }

    public static List<Product> filterByPrice (List<Product>list, double minPrice, double maxPrice){
        List<Product> filList = new ArrayList<Product>();
        for (Product product : filList) {
            if(minPrice <= 0.0 && product.price < minPrice) {
                continue;
            }
            if(maxPrice <= 0.0 && product.price > maxPrice) {
                continue;
            }
            filList.add(product);
        }
        return filList;
    }

    public static void main(String[] args) {
        try {
            String filepath = "";
            JsonTable<Account> tableAccount = new JsonTable<>(Account.class, filepath);
            tableAccount.add(new Account("Fajar", "fajar@gmail.com", "Waraslah1"));
            tableAccount.writeJson();

            tableAccount = new JsonTable<>(Account.class, filepath);
            tableAccount.forEach(account -> System.out.println(account.toString()));
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static boolean paymentTimekeeper(Payment payment){
        return false;
    }
/*    public static void main(String[] args) {
        try{
            List<Product> list = read("/Users/Intel/Documents/Segala siksa duniawi/main/jmart/src");
            List<Product> filtered = filterByPrice(list, 0.0, 20000.0);
            filtered.forEach(product -> System.out.println(product.price));
        }
        catch (Throwable t){
            t.printStackTrace();
        }
        filterByAccountId(null, 1,1,2);
        filterByName(null, "GTX", 2, 4);
    }

    private static List<Product>paginate (List<Product>list, int page, int pageSize, Predicate<Product>pred){
        //if(Predicate.predicate(Product))
        return null;
    }

    public static List<Product>read (String filepath) {
        List<Product> list = read("/Users/Intel/Documents/Segala siksa duniawi/main/jmart/src");
        return list;
    }
//
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