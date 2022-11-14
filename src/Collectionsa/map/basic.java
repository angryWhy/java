package Collectionsa.map;

import java.util.*;

public class basic {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("1","2");
        m.put("2","1");
        //当有相同的key时候相当于替换
        m.put("1","3");

        //删除
        m.remove("1");

        //获取
        m.get("1");

        //大小，是否空
        m.size();
        m.isEmpty();

        //清空
        m.clear();;

        //查找键
        m.containsKey("1");

        //先取出所有的key，
        Set keys = m.keySet();
        for(Object k: keys){
            m.get(k);
        }
        Iterator iterator = keys.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
        }
        //去除所有value
        Collection co = m.values();


        //entry，键值对
        Set ent = m.entrySet();
        for(Object o : ent){
            //转换成Map.Entry
            Map.Entry en = (Map.Entry)o;
            en.getKey();
            en.getValue();
        }
        Iterator ite3 = m.entrySet().iterator();
        while (ite3.hasNext()) {
            Object next =  ite3.next();
            Map.Entry en = (Map.Entry)next;

        }
    }
}
