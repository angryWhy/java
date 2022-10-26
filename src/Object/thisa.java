package Object;

public class thisa {
    public static void main(String[] args){
        Dog d = new Dog("哈哈",20);
        Dog d1 = new Dog("哈哈",20);
        Dog d2 = new Dog("he",20);
        boolean f1 = d.compareTo(d1);
        boolean f2 = d.compareTo(d2);
        System.out.println(f1+""+f2);
    }
}
class This{
    String name;
    public This(String name){
        //java虚拟机给每个对象分配this
        //this.name就是当前对象的属性

        //this关键字访问对象的属性，方法，构造器
        //this来区别当前属性和局部变量
        //访问方法：this.方法名（参数列表），只能在构造器使用
        //this不能在外部使用，只能在类定义的方法使用
        this.name = name;
    }

    public This(){
        //访问构造器语法，访问另外一个构造器
        //必须放在第一条语句
        this("哈哈哈");
    }
    public void say(){

    }
    public void say2(){
        //可以使用
        say();
        //this使用
        this.say();
    }
}
class Dog{
    String name;
    int age;
    public Dog(String name,int age){
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(Dog d){
        if(d.name.equals(this.name)&&d.age==this.age){
            return true;
        }else {
            return false;
        }
    }
}
