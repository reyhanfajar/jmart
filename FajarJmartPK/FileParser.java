package FajarJmartPK;

public interface FileParser
{
    boolean read(String name);
    default Object write(){
        return null;
    }

    static Object newInstance(String name) {
        return null;
    }
}