 

public class Coupon
{
    public final String name;
    public final int code;
    public final double cut;
    public final Type type;
    public final double minimum;
    private boolean used;

    public enum Type{
        DISCOUNT,
        REBATE
    }
    
    public Coupon(String name, int code, Type type, double cut, double minimum){
        this.name = name;
        this.code = code;
        this.type = type;
        this.cut = cut;
        this.minimum = minimum;
        this.used = false;
    }
    
    public boolean isUsed(){
        return used;
    }

    public boolean canApply(PriceTag priceTag){
        if((priceTag.getAdjustedPrice()>=minimum)&&(used==false)){
            return false;
        }
        else{
            return false;
        }
    }

    public double apply(PriceTag priceTag){
        used = true;
        if(type==Type.DISCOUNT){
            return (priceTag.getAdjustedPrice()*((100-cut)/100));
        }
        else{
            return (priceTag.getAdjustedPrice()-cut);
        }
    }

    public boolean read(String name){
        return false;
    }
}
