package enmua;

public class func {
    public static void main(String[] args) {
        Season2 autumn = Season2.AUTUMN;
        //输出一个枚举对象的名称
        System.out.println(autumn.name());
        //输出枚举对象的编号
        System.out.println();
        Season2[] arr = Season2.values();
        for(Season2 obj:arr){
            System.out.println(obj);
        }
        //比较
        System.out.println(Season2.AUTUMN.compareTo(Season2.Spring));
    }
}
enum Season2{
    //多个常量，逗号分割
    Spring("春天","温暖"), AUTUMN("冬天","寒冷");
    Season2(String name,String desc){
        this.name = name;
        this.desc = desc;
    }
    private String name;
    private String desc;
}