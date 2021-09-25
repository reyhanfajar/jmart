package FajarJmartPK;

public class Store extends Recognizable implements FileParser{

    public String name;
    public String address;
    public String phoneNumber;
    
    public Store(int id, String name, String address, String phoneNumber){
        super(id);
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Store(Account account, String name, String address, String phoneNumber){
        super(account.id);
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public boolean read(String name){
        return false;
    }
}
