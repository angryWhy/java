package basic.variable;

public class basic {
    public  static void main(String[] args){
        //变量相当于内存存储空间的表示
        //先声明，后使用
        int a = 3;
        //声明变量
        int b;
        //赋值
        b = 5;
        int age = 23;
        String name = "haha";
        double score = 99.0;


        //+号使用
        //左右两边都是数值型，做加法运算
        //左右两边有一方为字符串，做拼接运算
        //从左到右
        System.out.println(100+98);
        System.out.println("10"+100+98);
    }

}
