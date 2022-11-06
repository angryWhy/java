package NormalClass.Wrapper.String;

public class Method {
    public static void main(String[] args) {
        //1.equals
        String a = "a";
        String b = "a";
        System.out.println(a.equals(b));

        //2.equalsIgnoreCase
        String c = "a";
        String c1 = "A";
        System.out.println(c.equalsIgnoreCase(c1));

        //3.length长度
        System.out.println(c.length());

        //4.indexOf,找到第一次出现位置
        System.out.println(a.indexOf("a"));

        //5.lastIndexOf
        System.out.println(a.lastIndexOf("a"));

        //6.subString,截取后面所有内容
        System.out.println(a.substring(1));
        //从0开始，取2个
        System.out.println(a.substring(0,2));

        //7.换成大写,小写
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());

        //8.拼接
        String ss = a.concat("哈哈");

        //9.replace，替换
        System.out.println(a.replace("a","c"));

        //10.split分割
        String arr = "1,2,3,4";
        String[] res = arr.split(",");

        //11.compareTo,比较大小,对应ascii码
        //相同返回0
        //长度相同或者不同，比较区分大小写，单个字符比较
        //如果前面部分相同，返回长度比较
    }
}
