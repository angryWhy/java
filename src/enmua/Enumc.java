package enmua;

public class Enumc {
    public static void main(String[] args) {
        System.out.println(Season.Spring);
    }
}
enum Season{
    //多个常量，逗号分割
   Spring("春天","温暖"), AUTUMN("冬天","寒冷");
     Season(String name,String desc){
       this.name = name;
       this.desc = desc;
    }
    private String name;
   private String desc;
}
enum Gen{
    //常量，无参构造器
    Girl,Boy;
}
