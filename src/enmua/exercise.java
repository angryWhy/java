package enmua;

public class exercise {
    public static void main(String[] args) {
        Week[] res = Week.values();
        for(Week w : res){
            System.out.println(w);
        }
    }
}
enum Week implements Ia{
    MONEDAY("星期一"),TUDEDAY("星期二"),WENDESDAY("星期三");
    Week(String name){
        this.name = name;
    }
    private String name;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void say() {

    }
}
interface Ia{
    void say();
}