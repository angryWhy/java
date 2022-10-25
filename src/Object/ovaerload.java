package Object;

public class ovaerload {
    Ta re = new Ta();
    String a = re.sum("小明",1,2,3,4);
}
class Ta{
    //重载要求，方法名必须相同
    //参数列表，必须不同
    //返回值，无要求
    public int caluate(int a,int b){
        return a+b;
    }
    public double caluate(double a,double b){
        return a+b;
    }

    //可变参数列表
    //int...表示可变参数，类型是int，可以接受多个int类型的参数
    //本质就是数组，实参可以是数组
    //可变参数必须在最后
    public String sum (String a,int... sums){
        int res = sums[0];
        return a+res;
    }
}
