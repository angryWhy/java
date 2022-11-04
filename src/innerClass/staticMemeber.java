package innerClass;

public class staticMemeber {


    public static void main(String[] args) {
        Outer10 a= new Outer10();
    }
}
class  Outer10{
    private String name = "1";
    private static int age = 20;
    static class Imm{
        public void say(){
            System.out.println(age);
        }
    }
}