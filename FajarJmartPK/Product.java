package FajarJmartPK;

public class Product
{
    
    private int idCounter;
    public int id;
    public String name;
    public int weight;
    public boolean conditionUsed;
    public PriceTag priceTag;
    public ProductCategory category;
    public ProductRating rating;
    
    public Product(String name, int weight, boolean conditionUsed, PriceTag
                    priceTag,ProductCategory category){
        int boundaries = 1;
            if(boundaries == 1){
                this.id = 1;
                boundaries = 0;
            }
            else{
                this.id = id;
            }
        this.idCounter = id++;
        this.name = name;
        this.weight = weight;
        this.conditionUsed = conditionUsed;
        this.priceTag = priceTag;
        this.category = category;
        this.rating = new ProductRating();
    }
}
