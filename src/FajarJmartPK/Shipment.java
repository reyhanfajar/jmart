package FajarJmartPK;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

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
        public static final SimpleDateFormat ESTIMATION_FORMAT = new SimpleDateFormat("E MMMMM dd yyyy");
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
        Calendar calendar = Calendar.getInstance();
            if(this.bit==1<<0|| this.bit==1<<1){
                return ESTIMATION_FORMAT.format(reference.getTime());
            }
            else if(this.bit==1<<2){
                calendar.setTime(reference);
                calendar.add(Calendar.DATE, 1);
                return ESTIMATION_FORMAT.format(calendar);
            }
            else if(this.bit==1<<3){
                calendar.setTime(reference);
                calendar.add(Calendar.DATE, 2);
                return ESTIMATION_FORMAT.format(calendar);
            }
            else if(this.bit==1<<4){
                calendar.setTime(reference);
                calendar.add(Calendar.DATE, 5);
                return ESTIMATION_FORMAT.format(calendar);
            }
            else{
                return null;
            }
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

