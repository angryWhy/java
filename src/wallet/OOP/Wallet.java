package wallet.OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Wallet {
    boolean loop = true;
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm");
    String detail = "========零钱通明细========";
    String note = "";
    Scanner in = new Scanner(System.in);
    String key = in.next();
    public void mainMenu(){
        do{
            System.out.println("\t\t========零钱通明细========");
            System.out.println("\t\t\t 1 零钱通明细");
            System.out.println("\t\t\t 2 收益入账");
            System.out.println("\t\t\t 3 消费");
            System.out.println("\t\t\t 4 退    出");
            System.out.println("\t\t\t 请选择【1-4】");
            Scanner in = new Scanner(System.in);
            String key = in.next();
            switch (key){
                case "1":

                    this.detail();
                    break;
                case "2":

                    this.income();
                    break;
                case "3":

                   this.pay();
                    break;
                case "4":
                    this.out();
                    break;
                default:
                    loop = false;
                    System.out.println("选择有误，重新选择");

            }
        }while(loop);
    }
    public void detail(){
        System.out.println(detail);
    }
    public void income(){
        System.out.println("收益入账金额：");
        money = in.nextDouble();
        if(money<0){
            System.out.println("金额必须大于0");
           return;
        }
        balance +=money;
        date = new Date();
        detail+="\n收益入账\t"+money+"\t入账时间"+sdf.format(date)+"\t"+ "余额"+balance;
    }
    public void pay(){
        System.out.println("消费金额：");
        money = in.nextDouble();
        if(money>balance){
            System.out.println("余额不足");
            return;
        }
        System.out.println("消费说明：");
        note = in.next();
        balance-=money;
        date = new Date();
        detail+="\n"+note+"\t-"+money+"\t消费时间"+sdf.format(date)+"\t"+ "余额"+balance;
    }
    public void out(){
        String choice = "";
        while (true){
            System.out.println("\t\t\t 你确定要退出吗？（y/n）");
            choice = in.next();
            if("y".equals(choice)||"n".equals(choice)){
                break;
            }
        }
        if(choice.equals("y")){
            loop = false;
        }
    }
}
