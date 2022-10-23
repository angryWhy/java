package basic.control;

import java.util.Scanner;

public class basic {

    public static void main(String[] args){
        //双分支
        System.out.println("请输入年龄");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if(age>10){
            System.out.println("哈哈哈");
        }else{
            System.out.println("呵呵呵");
        }

        //多分支
        int score = in.nextInt();
        if(score>90){
            System.out.println("优秀");
        } else if (score>70) {
            System.out.println("良好");
        } else if(score>60){
            System.out.println("及格");
        }

        //switch
        //case常量表达式
        //default，可选
        System.out.println("请输入一个字符");
        char ch = in.next().charAt(0);
        switch (ch){
            case 'a':
                System.out.println("星期一");
                break;
            case 'b' :
                System.out.println("星期二");
        }
    }
}
