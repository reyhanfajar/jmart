package FajarJmartPK;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Shipment{

    public static final SimpleDateFormat ESTIMATION_FORMAT = new SimpleDateFormat("E MMMMM dd yyyy");

    public static final Plan INSTANT = new Plan((byte) (1<<0));
    public static final Plan SAME_DAY = new Plan((byte) (1<<1));
    public static final Plan NEXT_DAY = new Plan((byte) (1<<2));
    public static final Plan REGULER = new Plan((byte) (1<<3));
    public static final Plan KARGO = new Plan((byte) (1<<4));

    public String address;
    public int cost;
    public byte plan;
    public String receipt;

    public Shipment(String address, int cost, byte plan, String receipt){
        this.address = address;
        this.cost = cost;
        this.plan = plan;
        this.receipt = receipt;
    }

    public String getEstimatedArrival(Date reference){
        Calendar calendar = Calendar.getInstance();
            if(this.plan==1<<0|| this.plan==1<<1){
                return ESTIMATION_FORMAT.format(reference.getTime());
            }
            else if(this.plan==1<<2){
                calendar.setTime(reference);
                calendar.add(Calendar.DATE, 1);
                return ESTIMATION_FORMAT.format(calendar);
            }
            else if(this.plan==1<<3){
                calendar.setTime(reference);
                calendar.add(Calendar.DATE, 2);
                return ESTIMATION_FORMAT.format(calendar);
            }
            else if(this.plan==1<<4){
                calendar.setTime(reference);
                calendar.add(Calendar.DATE, 5);
                return ESTIMATION_FORMAT.format(calendar);
            }
            else{
                return null;
            }
    }

    public boolean isDuration(Plan reference){
        if((plan&reference.bit)!=0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isDuration(byte Object, Plan reference){
        byte flags=0;
    //    for(byte i=0; i<args.length; i++){
    //        flags|=args[i].bit;
    //    }
    //    this.bit = flags;
        return false;
    }

    public static class Plan{
        public final byte bit;

        public Plan(byte bit) {
            this.bit = bit;
        }
    }
}

