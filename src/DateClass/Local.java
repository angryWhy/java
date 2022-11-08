package DateClass;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Local {
    public static void main(String[] args) {
        //now返回当前日期
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        //获取方法
        ld.getYear();

        //DateTimeFormatter进行格式化
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月hh日");
        String ss = dtf.format(ld);

        //时间戳
        Instant in = Instant.now();
        //from将时间戳转换为日期
        Date da = Date.from(in);
        //将date转为instant对象
        Instant ine = da.toInstant();


        //提供plus和minus对当前时间进行加或者减
        //加90天
        LocalDate ld2 = ld.plusDays(90);
        //minus
        LocalDate ld3 = ld.minusDays(90);
    }
}
