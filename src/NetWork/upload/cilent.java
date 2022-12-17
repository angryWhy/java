package NetWork.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class cilent {
    public static void main(String[] args) throws IOException {
        //创建客户端，得到Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(),8888);

        //将图片读到程序中，输入流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("d:\\a.jpg"));

        //获取文件的内容bytes数组
        byte[] bytes= new byte[1024];

        //创建socke输出流,将byes数据发送给服务端
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());

        //写入到数据通道
        bufferedOutputStream.write(bytes);

        //向服务器发送消息，已经收到图片

        //设置结束的标志
        bufferedOutputStream.close();
        socket.shutdownOutput();

        //关闭流
        socket.close();
    }
}
