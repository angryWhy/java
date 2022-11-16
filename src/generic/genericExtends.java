package generic;

import java.util.List;

public class genericExtends {
    public static void main(String[] args) {

    }
}
class Extedn{
    //List<?>任意类型都可以接受
    public static void printCollection(List<?> a){

    }
    //? extends List,表示的是上限，接受本类及其子类
    public static void printCollection2(List<? extends List> a){

    }
    //? extends List,表示的是下限，接受本类和父类
    public static void printCollection3(List<? super List> a){

    }

}
