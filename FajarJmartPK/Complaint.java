

import java.text.SimpleDateFormat;
import java.util.Date;

public class Complaint extends Recognizable implements FileParser
{
    
   // public String date;
    Date myDate = new Date();
    SimpleDateFormat mdyFormat = new SimpleDateFormat("MM-dd-yyyy");
    public String date = mdyFormat.format(myDate);
    
    public String desc;

    public Complaint(int id, String desc) {
        super(id);
        this.desc = desc;
    }
    
    @Override
    public boolean read(String name){
        return true;
    }

    @Override
    public Object write(){
        return null;
    }
}
