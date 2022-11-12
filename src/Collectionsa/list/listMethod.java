package Collectionsa.list;

import java.util.List;

public class listMethod {
    public static void main(String[] args) {
         List li = (List) new Arraylist2();
         li.add("1");
         li.add("2");
         //插入，1的位置插入新元素
         li.add(1,"33");
         li.add(2,new Arraylist2());

         //indexOf和lastindexOf，首次出现位置和末次出现位置
        li.indexOf("1");
        li.lastIndexOf("1");

        //set指定位置的元素替换成
        li.set(0,"222");
    }
}
