package basic.symbol;

public class symbol {
    public static void main(String[] args){
        //除，int运算，输出：2
        System.out.println(10/4);
        //除，double，运算：输出2.5
        System.out.println(10.0/4);


        //%取模运算
        //%本质，是一个公式，a%b = a - a / b * b
        System.out.println(10%3);
        System.out.println(-10%3);
        System.out.println(10%-3);

        //自加，自减
        int i = 1;
        i = i++;//temp = i; i = i + 1  ; i = temp
        int a = 2;
        a = ++a;//i = i + 1  ; temp = i;  i = temp

        //逻辑运算符
        //短路与&&，短路或||，取反！
        //逻辑与&,逻辑或|，^逻辑异或，a^b不同的时候为真，一个真一个假


        //三元运算符
        int s1,s2;
        s1 = 1;
        s2 = 2;
        int res = s1>s2? (int)1.1 : (int)2.2;
        double res2 = s1>s2?1.1:2.2;
    }
}
