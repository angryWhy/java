package basic.control;

public class whilea {
    public static void main(String[] args){
        //while
        int count = 0;
        while (count<200){
            if(count<=100&&count>0&&count%3==0){
                System.out.println(count);

            }
            if(count>=40&&count%2==0){
                System.out.println(count);
            }
            count++;
        }
        //do-while,至少循环一次
        //先执行在判断，至少执行一次
        int cc = 1;
        do{
            System.out.println("哈哈"+cc);
            cc++;
        }while (cc<=10);
    }
}
