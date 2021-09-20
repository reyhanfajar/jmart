package FajarJmartPK;

public class Coupon
{
    public enum Type{
    DISCOUNT, REBATE;
    }

    public boolean isUsed(){
        return used;
    }
    
    public boolean canApply(PriceTag priceTag){
        if(priceTag.getAdjustedPrice()>=minimum){
            return true;
        }
        else{
            return false;
        }
    }
    
    public double apply(PriceTag priceTag){
        this.used = true;
        return (priceTag.getAdjustedPrice()-cut);
    }
    
    public String name;
    public int code;
    public double cut;
    public Type type;
    public double minimum;
    private boolean used;
    
    public Coupon(String name, int code, Type type, double cut, double minimum){
        this.name = name;
        this.code = code;
        this.type = type;
        
        switch(type){
            case REBATE:
            //    if(PriceTag.getAdjustedPrice()>=cut) return 0.0;
            //        return getAdjustedPrice() - cut;
                    break;
            case DISCOUNT:
                break;
        }
        
        this.cut = cut;
        this.minimum = minimum;
        this.used = false;
    }
    
}
