package FajarJmartPK;

public class Jmart
{
    public static void main(String[] args) {
    }

    public static Product createProduct(){
        return new Product(1, 123, "SWORD", 5000, false, null, ProductCategory.MISCELLANEOUS, null);
    }

    public static Coupon createCoupon(){
            return new Coupon("My coupon", 486, Coupon.Type.DISCOUNT, 1000, 5000);
    }
    
    //public static ShipmentDuration createShipmentDuration(){
    //    return new ShipmentDuration(ShipmentDuration.INSTANT, ShipmentDuration.KARGO);
    //}
}
