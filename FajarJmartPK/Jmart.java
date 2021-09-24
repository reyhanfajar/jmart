package FajarJmartPK;

public class Jmart
{
    public static void main(String[] args) {
    }

    public static Product createProduct(){
        return new Product("Sword", 3500, false, new PriceTag(1500.0), ProductCategory.MISCELLANEOUS);
    }

    public static Coupon createCoupon(){
            return new Coupon("My coupon", 486, Coupon.Type.DISCOUNT, 1000, 5000);
    }
    
    public static ShipmentDuration createShipmentDuration(){
        return new ShipmentDuration(ShipmentDuration.INSTANT, ShipmentDuration.KARGO);
    }
}
