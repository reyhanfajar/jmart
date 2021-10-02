 
import java.util.Date;
import java.text.SimpleDateFormat;

public class Invoice extends Recognizable implements FileParser{

    Date myDate = new Date();
    SimpleDateFormat mdyFormat = new SimpleDateFormat("MM-dd-yyyy");
    public String date = mdyFormat.format(myDate);

    public int buyerId;
    public int productId;
    public int complaintId;
    public Rating rating = Rating.NONE;
    public Status status = Status.WAITING_CONFIRMATION;
    
    public enum Status{
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
    
    protected Invoice(int id, int buyerId, int productId){
        super(id);
        this.buyerId = buyerId;
        this.productId = productId;
    }

    public double getTotalPay(){
        return 0.0;
    }

    @Override
    public boolean read(String name) {
        return false;
    }
    @Override
    public Object write(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
