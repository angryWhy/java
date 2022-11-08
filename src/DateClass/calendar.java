package DateClass;

import java.util.Calendar;

public class calendar {
    public static void main(String[] args) {
        //1.calendar是一个抽象类，并且构造器是private
        //2.可以getInstance()获取实例
        //3.通过大量方法和字段
        Calendar ca = Calendar.getInstance();
        System.out.println(ca);

        //获取日历对象的某个字段
        ca.get(Calendar.YEAR);
        //月要加1
        ca.get(Calendar.MONTH);
        ca.get(Calendar.DAY_OF_MONTH);
        ca.get(Calendar.HOUR);
        ca.get(Calendar.MINUTE);
        ca.get(Calendar.SECOND);

    }
}
