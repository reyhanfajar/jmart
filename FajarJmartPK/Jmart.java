package FajarJmartPK;


    public class Jmart
    {

        public static void main(String[] args){   
        }

        public static Product createProduct(){
            return new Product("Sword", 3000, true ,new PriceTag(700.0)
            , ProductCategory.MISCELLANEOUS);
        }
        
        public Coupon createCoupon(){
            return new Coupon("My coupon", 486, Coupon.Type.DISCOUNT, 50, 1000  );
        }
        
        public ShipmentDuration createShipmentDuration(){
            return new ShipmentDuration(ShipmentDuration.NEXT_DAY
            , ShipmentDuration.KARGO);
        }
    }