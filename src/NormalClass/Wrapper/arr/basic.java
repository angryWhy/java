package NormalClass.Wrapper.arr;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class basic {
    public static void main(String[] args) {
        Integer[] integers = {1,23,3,4,5};
        Arrays.toString(integers);
        //排序,sort方法也是重载的
        Arrays.sort(integers);

        //定制排序
        //实现了comparator接口的匿名内部类
        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });


        //二分查找法
        Integer[] in = {1,2,3,4,56};
        Arrays.binarySearch(in,46);

        //copyOf,从数组中，拷贝,第二个参数为长度
        Integer[] newarr = Arrays.copyOf(in,in.length);

        //fill填充
        Integer[] in2 = {1,3,4,5};
        Arrays.fill(in2,99);

        //equals，比较数组内容是否一样
        Arrays.equals(in,in2);

        //asList将数组转换为集合
        List li = Arrays.asList(1,23,45,5);

    }
}
