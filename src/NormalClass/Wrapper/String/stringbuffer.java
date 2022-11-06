package NormalClass.Wrapper.String;

public class stringbuffer {
    public static void main(String[] args) {
        //父类abstraStringBuilder，
        //char[] value，存放内容，在堆中
        //final类
        //1.默认构造器,大小为16
        StringBuffer bu = new StringBuffer();
        //2.通过构造器指定value大小
        StringBuffer bu1 = new StringBuffer(100);
        //3.直接放字符串,当前长度+16
        StringBuffer bu2 = new StringBuffer("hahah");


        //string->stringbuffer
        String sss = "哈哈";
        //方式1:使用构造器，返回的是StringBuffer对象，对str本身没有影响
        StringBuffer sb = new StringBuffer(sss);
        //方式二:默认构造器，append
        StringBuffer sb1 = new StringBuffer();
        sb1.append(sss);

        //stringbuffer->string
        StringBuffer sb3 = new StringBuffer(sss);
        //方式一：toString()
        sb3.toString();
        //方式二：构造器
        String sb4 = new String(sb3);
    }
}
