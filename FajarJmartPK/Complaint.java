package FajarJmartPK;

public class Complaint extends Recognizable implements FileParser
{
    public String date = "Minggu";
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
