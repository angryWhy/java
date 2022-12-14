package File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
}
