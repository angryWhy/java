package basic.control;

import java.util.Scanner;

public class doublefor {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            double count = 0;
            int ok = 0;
            for(int j = 0;j<5;j++){
                double score = in.nextDouble();
                count+=score;
                if(score>60){
                    ok++;
                }
                System.out.println("班级:"+i+" ----"+"成绩:"+score);
            }
            System.out.println("第"+i+"班"+"平均成绩为"+count/5);
            System.out.println("及格人数"+ok);
        }
        for(int i = 1;i<=5;i++){
            for (int k =1;k<=5-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2 * i-1;j++){
                if(j == 1 || j == 2 * i - 1||i==5){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
