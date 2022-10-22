package variable;

public class transform {
public  static  void main(String[] args){
    //转换，赋值或者运算的时候，精度小的类型转换为精度大的类型，自动类型准换
    //char-->int--->long--->float--->double
    //byte--->short--->int--->long-->float--->double


    //1.当多种数据混合运算，系统首先将所有数据转换成容量最大的那种数据类型，进行计算
    int a = 2;
    double d = a + 1.1f;
    //2.精度大转换成精度小的，会报错
    //3.（byte，short）和char之间不会进行转换
    //4.byte,short,char可以运算,转换成int,单独运算或者混合运算，都会转换成int
    byte s1 = 1;
    byte s11 =1;
    short s2 = 2;
    int res = s1 +s2;



    //强制类型转换
    //将容量大的类型转换成容量小的类型
    //场景
    /*
    * 大->小
    * 强制转换针对最近的有效
    * char保存int常量值，不能保持int变量
    * byte和short运算，当做int处理
    * */
    //例子,将double转换成int类型
    int i = (int)1.9;
    System.out.println("n="+i);
    int x = (int)(10.9+6.5);
    int m = 2;
    char ch = (char)m;

    //转string类型
    /*
    * 方式一
    * */
    int n = 1;
    String n2 = n + "";
    /*
     * 方式二，内置包
     * */
    String ss = "123";
    int num = Integer.parseInt(ss);
    double dd = Double.parseDouble(ss);
    //取第一个字符
    System.out.println(ss.charAt(0));
}
}
