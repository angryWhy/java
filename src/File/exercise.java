package File;

import java.io.*;
import java.util.Properties;

public class exercise {
    public static void main(String[] args) {

    }
    public static void exercise1(){
        String directPath = "d:\\a.txt";
        File file = new File(directPath);
        if (!file.exists()){
            if(file.mkdirs()){
                System.out.println("创建目录成功");
            }
        }
        String filePath = directPath + "\\hello.txt";
        file = new File(filePath);
        if(!file.exists()){
            try {
                if(file.createNewFile()){
                    System.out.println("创建文件成功");
                    //如果文件创建成功，写入东西
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write("hello,wzx");
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void exercise02(){
        String filePath = "d:\\a.txt";
        String line = "";
        try {
            BufferedReader bufferedReader =  new BufferedReader(new FileReader(filePath));
            while((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void exercise03(){
        String filePath = "d:\\a.txt";
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(filePath));
            properties.list(System.out);
            Object name = properties.getProperty("name");
            Object age = Integer.parseInt( properties.getProperty("age"));
            Dog dog = new Dog(1,2);
            String file = "d:\\data.dat";
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(dog);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void sy(){
        String filePath = "d:\\a.txt";
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
            try {
                Object o = objectInputStream.readObject();
                Dog dog = (Dog)o;
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
class Dog{
    private int name;
    private int age;
    public void say(){

    }
    public Dog(int name,int age){
        this.name = name;
        this.age = age;
    }
}
