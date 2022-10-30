package house;

public class domain {
    private int id;
    private String name;
    private String phone;
    private String address;
    private int rent;
    private String state;
    public domain(int id,String name,String phone,String address,int rent,String state){
        this.address = address;
        this.name = name;
        this.id = id;
        this.rent = rent;
        this.phone = phone;
        this.state = state;
    }

    @Override
    public String toString() {
        return id + "\t\t"+ name + "\t" + phone + "\t\t"+  address +"\t" + rent +"\t" + state ;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
