package File.Object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class input {
    public static void main(String[] args) {
        //序列化就是在保存数据的时候，保存数据的值和数据类型
        //反序列化就是恢复数据时候，恢复数据的值和数据类型
        //Serializable，是一个标记接口


        //指定反序列化文件
        String filePath = "d:\\a.txt";
        try {
            ObjectInputStream oi = new ObjectInputStream(new FileInputStream(filePath));
            //读取序列化顺序要和保存序列化顺序一致，否则会出现异常
            System.out.println(oi.readInt());
            System.out.println(oi.readBoolean());
            System.out.println(oi.readChar());
            System.out.println(oi.readDouble());
            System.out.println(oi.readUTF());
            oi.close();
            try {
                Object o = oi.readObject();
                //希望调用dog方法
                //需要将dog类引入定义，拷贝到工程，引用的位置
                Dog dog = (Dog)o;

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            //底层会转型Object->Dog
            try {
                System.out.println(oi.readObject());
            } catch (ClassNotFoundException e) {

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

