package FajarJmartPK;

import java.util.HashMap;
import java.util.Map;

public class Serializable implements Comparable<Serializable> {
    public final int id;
    private static HashMap<Class<?>, Integer> mapCounter;

    public int compareTo(Serializable other) {
        return Integer.compare(this.id, other.id);
    }

    public boolean equals(Object other){
        if(other instanceof Serializable){
            return equals(other);
        }
        else{
            return false;
        }
    }

    public boolean equals(Serializable other){
        return this.id == other.id;
    }

    public static <T> Integer getClosingId(Class <T>clazz){
        return getClosingId(clazz);
    }

    public static Integer setClosingId(Class<Serializable>clazz, int id){
        return setClosingId(clazz, id);
    }

    protected Serializable(){
        id = 1;
        Integer counter = mapCounter.get(getClass());
            if(counter == null){
                counter = 0;
            }
            else{
                mapCounter.put(getClass(), counter + 1);
            }
    }

    public static void main(String[] args) {
        System.out.println("account id : " + new Account(null, null, null, -1).id);
        System.out.println("account id : " + new Account(null, null, null, -1).id);
        System.out.println("account id : " + new Account(null, null, null, -1).id);

        System.out.println("account id : " + new Payment(-1, -1, -1, null).id);
        System.out.println("account id : " + new Payment(-1, -1, -1, null).id);
        System.out.println("account id : " + new Payment(-1, -1, -1, null).id);
    }
}
