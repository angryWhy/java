package Err;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throwsa {
    public static void main(String[] args) {
        err();
    }
    //编译异常必须处理thorw，运行异常可以不处理
    public static void err() throws RuntimeException{

    }
    public void f1(){
        //创建一个文件流对象
        //filenotfound编译异常处理
        try {
            FileInputStream fis = new FileInputStream("d://");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    //调用f2方法的调用者去处理
    //也可以是个列表
    public void f2() throws FileNotFoundException,NullPointerException{
        //创建一个文件流对象
        //filenotfound编译异常处理

            FileInputStream fis = new FileInputStream("d://");

    }
}
class Father{
    public void say()throws RuntimeException{

    }
}
class son extends Father{
    //要么一样，要么是子类的异常
    public void say() throws ArithmeticException{

    }
}
