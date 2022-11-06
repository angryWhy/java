package NormalClass.Wrapper.String;

public class bufferMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("a");
        sb.append("e");
        //删除
        sb.delete(11,14);
        //替换
        sb.replace(1,3,"ee");
        //查找字符
        sb.indexOf("a");
        //插入,3位置插入，后面的元素后移
        sb.insert(3,"哈哈哈");


        String str = null;
        //abstractStringBuilder，append方法，"null"
        sb.append(str);
        //会抛出空指针异常
        StringBuffer sb2 = new StringBuffer(str);
    }
}
