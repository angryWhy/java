package File.properties;

import java.io.*;
import java.util.Properties;

public class basic {
    public static void main(String[] args) {
            //传统方式获取对象的值和键
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src:\\mysql.proterties"));
            String line = "";
            while((line=bufferedReader.readLine())!=null){
                System.out.println(line);
                String[] arr = line.split("=");
                System.out.println(arr[1]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //使用properties类
    //读取
    public static void usePro(){
        //使用properties类，来读取mysql.properties文件
        //1.创建properties对象
        Properties proterties = new Properties();
        //2.指定加载配置文件
        try {
            proterties.load(new FileReader("src:\\msql.properties"));
            //3.把k-v显示在控制台
            proterties.list(System.out);
            //4.获取值
            String user = proterties.getProperty("user");
            String pwd = proterties.getProperty("pwd");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //设置
    public static void setPro(){
        //创建文件
        Properties properties = new Properties();

        //创建
        //如果有key就是修改，如果没有就是创建
        properties.setProperty("charset","utf8");
        properties.setProperty("user","汤姆");
        properties.setProperty("pwd","123");

        //将key-value存储到文件里去
        try {
            properties.store(new FileOutputStream("src:\\mysql.properties"),null);
            System.out.println("保存配置文件成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
