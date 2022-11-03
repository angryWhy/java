package innerClass;

public class basic {
    //定义在外部类局部位置
    //局部类（有类名）
    //局部内部类（没名字！！！）

    //定义在外部成员位置
    //成员内部类（没有static）
    //静态内部类（没有static）
}
//局部类
class Outer{
    private int age = 20;
    private int ha = 20;
    private void ha(){}
    public void say(){

        //作用域：仅仅在定义它的方法内，代码块中
        //只能加final不能被继承，不能添加访问修饰符
        class Inner02{
            private int ha = 230;
            public void say02(){
                //可以访问私有属性

                System.out.println(age);
                ha();

                //如果外部类和内部类都有相同属性，就近原则，
                //访问外部：类名.this.属性名---本质就是外部类的一个对象
                System.out.println(Outer.this.ha);
            }


        }

        //外部类可以创建对象
        Inner02 in = new Inner02();
    }
}