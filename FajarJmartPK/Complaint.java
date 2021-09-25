package FajarJmartPK;

public class Complaint extends Transaction implements FileParser
{
    public int paymentId;
    public String desc;

    public Complaint(int id, Payment payment, String desc) {
        super(id);
        this.payment = payment;
        this.desc = desc;
    }

//    public Complaint(int id, int buyerId, int storeId
//    , int paymentId, String desc){

//    }
    
    public boolean read(String name){
        return false;
    }

    public Transaction perform(){
        return null;
    }

//    boolean read(String name){
//        return false;
//    }
}
