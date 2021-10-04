package FajarJmartPK;

import java.util.ArrayList;

public class Filter{
    public static ArrayList<PriceTag> filterPriceTag(PriceTag[] list
    , double value, boolean less){
        ArrayList<PriceTag> priceTags = new ArrayList<>();
        for(PriceTag e : list){
            if((less==true)&&(e.getAdjustedPrice()<value)){
                priceTags.add(e);
            }
            else{
                e.getAdjustedPrice();
                priceTags.add(e);
            }
        }
        return null;
    }

    public static void filterProductRating(ArrayList<ProductRating>list
    , double value, boolean less){
        for(ProductRating e : list){
            if(less==true){
                
            }
            else{

            }
        }
    }   
}
