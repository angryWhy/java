package Collectionsa.list;


import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
       List a = (List) new Arraylist();
       a.add("111");
       //自动装箱
       a.add(123);
       a.add(new Integer(111));


       //删除
        //传入index，返回布尔值
        a.remove(0);
        //出入要删除的对象
        a.remove("111");
        //是否存在,布尔值
        a.contains("111");
        //获取元素的个数
        a.size();
        //isEmpty，是否为空
        a.isEmpty();
        //clear,清空
        a.clear();

        //添加集合,实现Collections接口
        a.addAll(new ArrayList());
        //删除多个元素
        a.removeAll(new ArrayList());
    }
}
