package FajarJmartPK;

 
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class Invoice extends Serializable {

    Date myDate = new Date();
    SimpleDateFormat mdyFormat = new SimpleDateFormat("MM-dd-yyyy");

    public int buyerId;
    public int complaintId;
    public final String date = mdyFormat.format(myDate);
    public int productId;
    public Rating rating;
    
    public static enum Status{
        WAITING_CONFIRMATION,
        CANCELLED,
        ON_PROGRESS,
        ON_DELIVERY,
        COMPLAINT,
        FINISHED,
        FAILED;
    }
    
    public enum Rating{
        NONE,
        BAD,
        NEUTRAL,
        GOOD;
    }
    
    protected Invoice(int buyerId, int productId){
        this.buyerId = buyerId;
        this.productId = productId;
    }

    public class Record{
        public Date date;
        public String message;
        public Status status;
    }

    public double getTotalPay(){
        return 0.0;
    }
}
