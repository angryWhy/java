package NormalClass.Wrapper;

public class basic {
    public static void main(String[] args) {
        //手动装箱
        int n1 = 200;
        Integer n = new Integer(n1);
        Integer n2 = Integer.valueOf(n1);

        //手动拆箱
        int n3 = n.intValue();


        //自动
        Integer n4 = n1;
        //底层：Integer.valueOf(n1);

        int n5 = n4.intValue();

        Object obj = true?new Integer(1):new Double(1.0);
        //输出1.0，因为会转换成double类型
    }
}
