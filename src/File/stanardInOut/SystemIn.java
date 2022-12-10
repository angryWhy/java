package File.stanardInOut;

public class SystemIn {
    public static void main(String[] args) {
        //System类的public finial static InputStream in = null;
        //System.in  编译类型是InputStream
        //System.in 运行类型是 BufferInputStream
        System.out.println(System.in.getClass().getName());
    }
}
