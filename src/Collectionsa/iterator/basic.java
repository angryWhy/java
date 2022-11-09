package Collectionsa.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class basic {
    public static void main(String[] args) {
        Collection co = new ArrayList();
        co.add("1");
        co.add("2");
        co.add("3");

        //获取迭代器
        Iterator it = co.iterator();
        while (it.hasNext()){
            Object item = it.next();
        }
        //增强for
        for(Object o : co){

        }
    }
}
