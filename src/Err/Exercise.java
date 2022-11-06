package Err;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        try {
            if(args.length!=2){
                throw new ArrayIndexOutOfBoundsException("参数个数不正确！");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            cal(n1,n2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println();
        } catch (ArithmeticException e){
            System.out.println();
        }

    }
    public static double cal(int n1,int n2){
        return n1/n2;
    }
}
