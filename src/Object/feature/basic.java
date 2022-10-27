package Object.feature;

public class basic {
    //封装
    //1.将属性私有化，private
    //提供公有方法访问
    //公有方法设置
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(200);
    }
}
class Person{
    String name;
    private int age;
    private double salary;

    public Person(){

    }
    public Person(String name,int age,double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;

        //在构造器调用方法
        setAge(age);
        setName(name);
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary>20){
            this.salary = salary;
        } else {
            System.out.println("余额不足！");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=2&&name.length()<=4){
            this.name = name;
        }else {
            System.out.println("名字太长啦");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>120){
            System.out.println("太大了");
            return;
        }
        this.age = age;
    }
}