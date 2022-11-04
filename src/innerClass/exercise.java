package innerClass;

public class exercise {
    public static void main(String[] args) {
        f1(new Il() {
            @Override
            public void say() {
                System.out.println("我是哈哈哈");
            }
        });
        Bell be = new Bell();
        be.say(
                new Il() {
                    @Override
                    public void say() {
                        System.out.println("我是新创建的");
                    }
                }
        );
    }
    public static void f1(Il a){
        a.say();
    }
}
interface Il{
    void say();
}
class Bell{
    public void say(Il a){
        a.say();
    }
}
