package Collectionsa.list;

import java.util.ArrayList;

public class arrayListMethod {
    public static void main(String[] args) {
        //ArrayList线程是不安全的
        ArrayList arr = new ArrayList();
        arr.add(null);
        //arraylist基本等同于Vector



        //使用无参构造器：初始化elementData容量为0，第一次添加初始化elementdata为10，扩容为1.5倍
        ArrayList arr2 = new ArrayList();
        //使用有参构造器，elementData位指定容量大小，如需扩容，直接扩容为elementData为1.5倍
    }
}
