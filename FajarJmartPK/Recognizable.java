 

public class Recognizable
{  
    public final int id;
    
    protected Recognizable(int id){
        this.id = id;
    }

    public boolean equals(Object other){
        if(other instanceof Recognizable){
            return equals(other);
        }
        else{
            return false;
        }
    }

    public boolean equals(Recognizable other){
        return this.id == other.id;
    }
}
