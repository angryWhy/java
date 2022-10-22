package variable;

public class vartype {
    public static void main(String[] args){
        //基本数据类型和引用类型
        //基本数据类型，byte,short,int,long.float,double,boolean,char
        //引用类型，类，接口，数组




        //整形
        //byte--1个字节，short--2个字节，int---4个字节，long---8个字节
        //不能高位向低位转换，会丢失
        int a = 4;//4个字节



        //浮点型
        //单精度float，4--字节，double---8字节
        //浮点型常量（具体值）默认为double类型
        //声明float常量必须加，“f”，或者"F"
        float c = 1.1f;
        //float给double,低位转高位
        double d = c;
        //0可以省略
        double f = .211;
        //通常情况下，使用double，精度更高
        double r = 0.152125125;
        //比较
        double num1 = 2.7;
        double num2 = 8.1/3;//接近2.7，不是2.7
        //两个数的差值，在某个精度范围内进行判断
        if(Math.abs(num1-num2)<0.0001){
            System.out.println("插值非常小，在规定范围之，相等");
        }



        //字符类型，char
        //细节：必须要单引号，char本质是一个数字，对应的字符，可以进行运算，相当于一个整数
        //字符类型可以表示单个字符，字符类型是char，char是两个字节，可以存放汉子，多个用string
        char c1 = 'a';
        char c2 = '\t';
        char c3 = '哈';
        char c4 = 97;//可以存放一个数字，输出c4，会输出97表示的字符

        //本质 字符类型存储到计算机中，转换成码值-->二进制--->存储


        //布尔类型,1个字节
        boolean flag = true;
    }
}
