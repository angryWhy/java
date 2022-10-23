package basic.scanner;

import java.util.Scanner;

public class basic {
    public static void main(String[] args){
        //scanner简单的文本扫描器，创建scanner对象
        Scanner sc = new Scanner(System.in);
        //用户输入
        System.out.println("请输入名字");
        //接受用户的输入
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();

    }
}
