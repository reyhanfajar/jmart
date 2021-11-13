package FajarJmartPK;

import java.util.ArrayList;

public class Payment extends Invoice
{
    ArrayList<Record> history;
    public Shipment shipment;
    public int productCount;

    public Payment(int buyerId, int productId, int productCount, Shipment shipment){
        super(buyerId, productId);
        this.productCount = productCount;
        this.shipment = shipment;
    }

    public double getTotalPay(Product Product){
        return price;
    }

    public class Record{
        public final Date date;
        public String message;
        public Status status;

        public Record(Status status, String message){
            this.status = status;
            this.message = message;
        }
        
    }
}
