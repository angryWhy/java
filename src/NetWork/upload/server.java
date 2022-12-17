package NetWork.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        //1.服务端坚挺8888端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端监听已开启~~~");

        //2.等待连接
        Socket socket = serverSocket.accept();

        //3.读取客户端的数据
        //获取输入流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = new byte[1024];

        //将bytes数组，写入到指定的路径，得到一个文件
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("d:a.jpg"));
        bufferedOutputStream.write(bytes);


        //接收服务器发送的消息
        InputStream inputStream = socket.getInputStream();
        String str = "inputStream获取到的数据";
        System.out.println(str);

        bufferedOutputStream.close();
        socket.close();
        serverSocket.close();
    }
}
