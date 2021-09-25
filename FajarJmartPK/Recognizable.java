package FajarJmartPK;

public class Recognizable
{  
    public final int id;
    
    public Recognizable(int id){
        this.id = id;
    }

    public boolean equals(Object other){
        return (other instanceof Recognizable);//&&(id.other == id);
    }

    public boolean equals(Recognizable other){
        return true;
    }
}
