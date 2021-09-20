package FajarJmartPK;


    public class Jmart
    {
        public static Product create(){
            return new Product("Sword", 3000, true ,new PriceTag(700.0)
            , ProductCategory.MISCELLANEOUS);
        }
        
        public static void main(String[] args){   
        }
            
        public Product createProduct(){
            return NULL;
        }
        
        public Coupon createCoupon(){
            return NULL;
        }
        
        public ShipmentDuration createShipmentDuration(){
            return NULL;
        }