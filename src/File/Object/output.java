package File.Object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class output {
    public static void main(String[] args) {
        //序列化后，保存的文件格式，不是存文本，而是按照他的格式来保存
        String filePath = "d:\\a.txt";
        try {
            ObjectOutputStream Oo = new ObjectOutputStream(new FileOutputStream(filePath));
            //序列化数据
            //100实现了serializable
            Oo.write(100);
            //true也实现了接口
            Oo.writeBoolean(true);
            Oo.writeChar('a');
            Oo.writeUTF("我是字符串");
            Oo.writeObject(new Dog());
            Oo.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
//如果需要序列化，某个类，必须实现接口
class Dog implements Serializable {
    private int age;
    private String name;
    private String hobby;
    //静态属性或者
    //序列化对象，要求属性的类型也是实现序列化接口
    //比如子类，父类实现了序列化接口，也是可以的
    //private Cat cat
    private static final long serialVersionUID = 1L;
    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}