package Collectionsa.set;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        //本质上执行的是hashmap
        HashSet hs = new HashSet();

        //add方法没返回布尔值,添加成功，返回true，同理
        hs.add("1");
        hs.add("2");
        hs.add("1");//false

        //可以
        hs.add(new Dog());
        hs.add(new Dog());

        //不可以
        hs.add(new String("1"));
        hs.add(new String("1"));
    }
}
class Dog{

}
