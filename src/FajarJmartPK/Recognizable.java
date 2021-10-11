package FajarJmartPK;

public class Recognizable implements Comparable<Recognizable> {
    public final int id;
    
    protected Recognizable(){
        id = 1;
    }

    @Override
    public int compareTo(Recognizable other) {
        return Integer.compare(this.id, other.id);
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

    public static int setClosingId(Class<Recognizable>clazz, int id){
        return setClosingId(clazz, id);
    }

    public static <T> int getClosingId(Class <T>clazz){
        return getClosingId(clazz);
    }
}
