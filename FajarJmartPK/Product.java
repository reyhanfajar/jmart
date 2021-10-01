package FajarJmartPK;

import FajarJmartPK.Shipment.MultiDuration;

public class Product extends Recognizable implements FileParser
{

    public int storeId;
    public String name;
    public int weight;
    public boolean conditionUsed;
    public PriceTag priceTag;
    public ProductCategory category;
    public ProductRating rating;
    Shipment.MultiDuration multiDuration;

    public Product(int id, int storeId, String name, int weight, boolean conditionUsed, PriceTag priceTag,
    ProductCategory category, Shipment.MultiDuration multiDuration){
        super(id);
        this.storeId = storeId;
        this.name = name;
        this.weight = weight;
        this.conditionUsed = conditionUsed;
        this.priceTag = priceTag;
        this.category = category;
        this.rating = new ProductRating();
        this.multiDuration = multiDuration;
    }
    
    @Override
    public boolean read(String name) {
        return false;
    }

    @Override
    public Object write(){
        return null;
    }

    public String toString(){
        return "name: " + this.name + "\nweight: " + this.weight + "\nconditionUsed: " 
        + this.conditionUsed + "\npriceTag: " + this.priceTag + "\nCategory: " + this.category 
        + "\nRating: " + this.rating + "\nstoreId: " + this.storeId;
    }
}
