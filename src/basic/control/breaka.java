package basic.control;

public class breaka {
    public static void main(String[] args){
        int flag = 0;
        for(int i = 0;i<10;i++){
            int res = (int)(Math.random()*100+1);
            if(res>80){
                System.out.println(res+"--次数"+i);
                break;
            }

        }
    }
}
