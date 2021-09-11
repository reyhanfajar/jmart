package FajarJmartPK;

    public class Jmart
    {
        int getPromo(){
            return 0;
        }
        String getCustomer()
        {
            String customer = "oop";
            return customer;
        }
        
        float getDiscountPercentage(int before, int after){
            float disc = 0;
            if (before < after){
                 disc = 100-before/after;
            }
            return disc;
        }
        
        int getDiscountedPrice(int price,float discountPercentage){
            return price*(int)(100-discountPercentage);
        }
        
        int getOriginalPrice(int discountedPrice, float discountPercentage){
            return (int)(100/(100-discountPercentage)*discountedPrice);
        }
        float getCommissionMultiplier(){
            return 0.05f;
        }
        int getAdjustedPrice(int price){
            return (int)(price*0.05f);
        }
        int getAdminFee(int price){
            return (int)(price*getCommissionMultiplier());
        }
        public static void main(String[] args){   
        
        }
    }