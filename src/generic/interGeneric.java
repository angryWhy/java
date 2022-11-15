package generic;

public class interGeneric {
    public static void main(String[] args) {

    }
}
interface Iu<T,E>{
    T getT();
    E getE();
}
interface It extends Iu<String,Integer>{

}
class Do implements Iu<String,Character>{
    @Override
    public String getT() {
        return null;
    }

    @Override
    public Character getE() {
        return null;
    }
}