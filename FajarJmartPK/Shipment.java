import java.text.SimpleDateFormat;
import java.util.Date;

public class Shipment implements FileParser{
    public String address;
    public int shipmentCost;
    public Duration duration;
    public String receipt;
    
    public class MultiDuration{
        public byte bit;
        
        public MultiDuration(Duration... args){
            byte flags=0;
                for(byte i=0; i<args.length; i++){
                    flags|=args[i].bit;
                }
            this.bit = flags;
        }

        public boolean isDuration(Duration reference){
            if((bit&reference.bit)!=0){
                return true;
            }
            else{
                return false;
            }
        }
    }
    
    public static class Duration{
        Date myDate = new Date();
        SimpleDateFormat dMdyFormat = new SimpleDateFormat("DDD-MMMM-dd-yyyy");
        String dateChange = dMdyFormat.format(myDate);  
        //public static final ESTIMATION_FORMAT = dateChange;

        public static final Duration INSTANT = new Duration((byte) (1<<0));
        public static final Duration SAME_DAY = new Duration((byte) (1<<1));
        public static final Duration NEXT_DAY = new Duration((byte) (1<<2));
        public static final Duration REGULER = new Duration((byte) (1<<3));
        public static final Duration KARGO = new Duration((byte) (1<<4));
    
        public byte bit;

        private Duration(byte bit){
            this.bit = bit;
        }

        public String getEstimatedArrival(Date reference){
            //if((bit&reference.bit)==0||1){
            //    return dateChange;
            //}
            //else if((bit&reference.bit)==2){
            //    return null;
            //else if((bit&reference.bit)==3){
            //    return null;
            //}
            //else if((bit&reference.bit)==4){
            //
            //}
            return null;
            }
        }
    
    

    public Shipment(String address, int shipmentCost, Duration duration, String receipt){
        this.address = address;
        this.shipmentCost = shipmentCost;
        this.duration = duration;
        this.receipt = receipt;
    }
    
    @Override
    public boolean read(String name){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object write(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
