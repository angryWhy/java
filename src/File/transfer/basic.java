package File.transfer;

import java.io.*;

public class basic {
    public static void main(String[] args) {
        //转换流
        //InputStreamReader和OutPutStreamWriter

        String fiepath = "d:\\a.txt";
        try {
            BufferedReader bu = new BufferedReader(new FileReader(fiepath));
            String s = bu.readLine();
            bu.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void transfer () {
        //转换流
        //InputStreamReader：Reader子类，可以将InputStream包装成Reader
        //OutputStreamWriter：Writer子类，可以将OutputStream包装成Writer

        //创建InputStreamReader对象
        //将字节流FileInputStream转换成字符流InputStreamReader，指定编码
        String filepath = "d:\\a.txt";
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filepath), "utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            //读取
            String line = bufferedReader.readLine();
            System.out.println(line);
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void transfer02(){
        String filepath = "d:\\a.txt";
        //创建OutputStreamWriter对象
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(filepath),"utf-8");
            outputStreamWriter.write("hahaha");
            outputStreamWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
