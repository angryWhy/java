package DateClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class basic {
    public static void main(String[] args) throws ParseException {
        //获取当前时间
        Date d= new Date();
        System.out.println(d);

        //格式化日期
        SimpleDateFormat sm = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        String fore = sm.format(d);
        System.out.println(fore);


        //字符串必须和给定格式一样
        String s = "2022年11月01日 10:00:00 星期一";
        Date d2 = sm.parse(s);
    }
}
