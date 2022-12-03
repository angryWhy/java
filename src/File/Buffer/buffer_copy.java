package File.Buffer;

import java.io.*;

public class buffer_copy {
    public static void main(String[] args) {

    }
    //buffer是按照字符来读取的，不要操作二进制文件
    public static void copy(){
        String src = "d:\\a.txt";
        String dest = "d:\\c.txt";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(src));
            bw = new BufferedWriter(new FileWriter(dest));
            while((line = br.readLine())!=null){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
