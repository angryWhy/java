package File;

import java.io.File;
import java.io.IOException;

public class basic {
    public static void main(String[] args) {
        //读取文件
        //根据路径构建一个file对象

        //父级目录文件+子路径构建

        //父级目录+子路径构建
    }
    public void create01(){
        String filepath = "d:\\news1.txt";
        File file = new File(filepath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void create02(){
        File file = new File("d:\\");
        String fileName = "a.txt";
        File fi = new File(file,fileName);
        try {
            fi.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void create03(){
        String parentPath = "d:\\";
        String fileName = "b.txt";
        File file = new File(parentPath,fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    //获取文件信息
    public void info(){
        //先创建文件对象
        File file = new File("d:\\c.txt");
        //调用对应的方法，得到对应的信息
        file.getName();
        //绝对路径
        file.getAbsolutePath();
        //父级目录
        file.getParentFile();
        //是否存在
        file.exists();

    }
}
