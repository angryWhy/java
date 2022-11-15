package generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class genexercise {
    public static void main(String[] args) {
        ArrayList<Employee<Date>> arr = new ArrayList<>();
        arr.add(new Employee<Date>("哈哈",18,new Date()));
        arr.add(new Employee<Date>("哈哈",18,new Date()));
        arr.add(new Employee<Date>("哈哈",18,new Date()));
        arr.sort(new Comparator<Employee<Date>>() {
            @Override
            public int compare(Employee<Date> o1, Employee<Date> o2) {
                int i = o1.getName().compareTo(o2.getName());
                return i;
            }
        });
    }
}
class Employee<T>{
    private String name;
    private int age;
    T birthday;
    public Employee(String name,int age,T birthday){
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public T getBirthday() {
        return birthday;
    }

    public void setBirthday(T birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday
                ;
    }
}