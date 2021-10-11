package FajarJmartPK;


public class Product extends Recognizable
{

    public int accountId;
    public double discount;
    public double price;
    public String name;
    public int weight;
    public boolean conditionUsed;
    public ProductCategory category;
    public byte shipmentPlans;

    public Product(int accountId, String name, int weight, boolean conditionUsed, double price, double discount,
    ProductCategory category, byte shipmentPlans){
        this.accountId = accountId;
        this.name = name;
        this.weight = weight;
        this.conditionUsed = conditionUsed;
        this.price = price;
        this.discount = discount;
        this.category = category;
        this.shipmentPlans = shipmentPlans;
    }

    public String toString(){
        return "\naccountId: " + this.accountId + "\nname: " + this.name + "\nweight: " + this.weight + "\nconditionUsed: "
        + "\nprice: " + this.price + "\ndiscount: " + this.discount + "\nconditionUsed: "
        + this.conditionUsed + "\nCategory: " + this.category;
    }
}
