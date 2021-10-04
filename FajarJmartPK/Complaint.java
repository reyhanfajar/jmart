package FajarJmartPK;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Complaint extends Recognizable implements FileParser
{
    public Date date;   
    public String desc;

    public Complaint(int id, String desc) {
        super(id);
        this.desc = desc;
        this.date = new Date();
    }
    
    @Override
    public boolean read(String name){
        return true;
    }

    @Override
    public Object write(){
        return null;
    }

    public String toString(){
        return "date=" + this.date + ", desc='" + this.desc +"'";
    }
}
