package basic.control;

public class fora {
    public static void main(String[] args){
        //for变量初始化；循环条件；循环变量迭代
        //指定次数
        int i = 0;


        //无限循环
        //for(;;){

        //}

        //1-100,9的倍数
        int count = 0;
        for( int start = 1; start<=100 ; start++){
            if(start%9==0){
                System.out.println(start);
                count+=start;
            }
        }
    }
}
