package Array;

import java.util.Scanner;

public class basic {
    public static void main(String[] args){
        double[] menus = {1.3,2.5};
        int count = 0;
        for(int i= 0;i< menus.length;i++){
            count+=menus[i];
        }

        //初始化,创建int数组，容量为5


        int[] a = new int[5];
        //方式二
        //数据是有默认值
        int[] b;
        b = new int[]{1, 99, 88,0,101,77};
        int max = 0;
        for(int i= 0;i<b.length;i++){
            if(i==0){
                max = b[i];
            }else{
                if(b[i-1]<b[i]){
                    max=b[i];
                }
            }
        }



       //动态缩减
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,0};
        do {
            int[] newArr = new int[arr.length-1];
            for(int i = 0;i<arr.length-1;i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
            System.out.println(arr);
            System.out.println("是否要继续缩减（Y/N）");
            Scanner in = new Scanner(System.in);
            String res = in.next();
            if(res.charAt(0)=='N'){
                break;
            }

        }while(true);
    }
}
