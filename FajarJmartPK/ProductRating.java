package FajarJmartPK;

public class ProductRating
{
   private long total;
   private long count;
   
   public ProductRating(){
       this.total = 0;
       this.count = 0;
   }
   
   public void insert(int rating){
       this.total = total+rating;
       this.count = count++;
   }
   
   public double getAverage(){
       return total/count;
   }
   
   public long getCount(){
       return count;
   }
   
   public long getTotal(){
       return total;
   }
}

