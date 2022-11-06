package NormalClass.Wrapper.String;

public class basic {
    public static void main(String[] args) {
        //Integer->String
        Integer i = 100;
        //方式一：
        String a = i+"";
        //方式二:
        String b = i.toString();
        String c = String.valueOf(i);

        //转包装类
        Integer f = Integer.parseInt(a);
        Integer f1 = new Integer(a);




        //String private final char value[],底层存储
        //value是final，不能更改
        String s = "haha";
        String s1 = new String("haha");
        //s !=s1
        //intern()，去常量池找幼儿米有相同的，有就返回常量池引用，没有就返回new String
        System.out.println(s==s1.intern());


        //创建两个对象，在池中
        String a1 = "a" + "b";

        //创建一个对象，在堆中相加
        //1.先创建stringBuilder
        //2.sb.append("")
        //3.toString
        String a2 = a +b;
    }
}
