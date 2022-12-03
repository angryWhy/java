package File.Buffer02;

import java.io.*;

public class copy {
    public static void main(String[] args) {
        String src = "d:\\a.png";
        String dest = "d:\\b.png";
        BufferedInputStream bi = null;
        BufferedOutputStream bo = null;
        try {
            bi = new BufferedInputStream(new FileInputStream(src));
            byte[] buff = new byte[1024];
            int len = 0;
            while((len = bi.read(buff))!=-1){
                bo.write(buff,0,len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bi.close();
                bo.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
