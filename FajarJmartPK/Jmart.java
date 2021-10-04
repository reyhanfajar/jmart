package FajarJmartPK;

import FajarJmartPK.Shipment.Duration;

public class Jmart
{
    public static void main(String[] args) {
    }

    public static Product createProduct(){
        //return new Product(1, 12456, "SWORD", 3000, false, priceTag, ProductCategory.MISCELLANEOUS, multiDuration);
        return null;
    }

    public static Coupon createCoupon(){
        //return new Coupon("Kupon", 6666, type, cut, minimum);
        return null;
    }
    
    public static Account createAccount(){
        return new Account(4869, "Fajar", "fajar4646@gmail.com", "Xxxxxxx1");
        //return null;
    }

    public static Complaint createComplaint(){
        return new Complaint(4646, "Kurir lagi isi bensin");
    }

    public static Shipment createShipment(){
        return new Shipment("Jl.Rumahku", 50000, Duration.INSTANT, "Nge bon boleh?");
    }

    public static Store createStore(){
        return new Store(123, "Fajar", "Jl.In Dulu Aja", "08123456789");
    }
}