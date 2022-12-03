package File.Buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class reader {
    public static void main(String[] args) {
        String filePath = "d:\\a.txt";
        try {
            //读文件
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            //读取
            String line;
            //readLine，按行读取
            //当返回时null，表示读取完毕
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
        }
    }
}
