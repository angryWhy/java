package Object.feature;

public class extend extends aaa{
    public extend(){
        //创建子类对象的时候，都会调用父类无参构造器，如果父类没有无参构造器，必须在子类构造器使用super调用
        System.out.println("子类构造器");
    }
    public void say(){
        System.out.println(name);
        //私有属性和方法不能访问
        //System.out.println(height);
        //需要通过共有的属性和方法去访问
    }

}
