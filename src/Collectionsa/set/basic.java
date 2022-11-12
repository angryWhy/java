package Collectionsa.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class basic {
    public static void main(String[] args) {
        //无序，不重复，
        //添加顺序和取出顺序不一致，但是固定的
        Set s = new HashSet();
        s.add("1");
        s.add("@");
        s.add(null);
        s.add(null);


        //遍历
        //迭代器
        Iterator it = s.iterator();
        while(it.hasNext()){
            Object o = it.next();
            System.out.println("obj+"+o);
        }
        //增强for
        for(Object o : s){
            System.out.println("obj+"+o);
        }
    }
}
