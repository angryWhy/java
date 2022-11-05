package Err;

public class basic {
    public static void main(String[] args) {
        int num = 1;
        int num2 = 0;
        //try-catch解决异常
        try {
            int res = num/num2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序继续运行");

        try {
            int res = num/num2;
            //异常后面的代码不会执行
            System.out.println("这里不会执行");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //子类异常必须在父类异常前面
        try {
            int res = num/num2;
            //异常后面的代码不会执行
            System.out.println("这里不会执行");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NullPointerException e){

        } finally {

        }
    }
}
