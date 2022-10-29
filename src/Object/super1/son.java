package Object.super1;

public class son extends father{
    public son(){
        super();
    }
    public static void main(String[] args) {

    }
    public void say(){
        System.out.println(super.age);
        super.say();
        say();
    }

}
