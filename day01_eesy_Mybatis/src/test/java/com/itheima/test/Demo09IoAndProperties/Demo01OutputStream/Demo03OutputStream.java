package com.itheima.test.Demo09IoAndProperties.Demo01OutputStream;

import java.io.File;
import java.io.FileOutputStream;

public class Demo03OutputStream {
    public static void main(String[] args) throws  Exception{
        /*
* 追加写/续写:使用两个参数的构造方法
FiLeOutputStream(String name， booLean append )创建一个向具有指定name的文件中写入数据的输出文件流。
* FiLeOutputStream(File fiLe, boolean append)创建一个向指定File对象表示的文件中写入数据的文件输出流。
* 参数:
string name ,File file:写入数据的目的地
booLean append:追加写开关
true:创建对象不会覆盖源文件,继续在文件的末尾追加写数据
* false:创建一个新文件,覆盖源文件

* */
        FileOutputStream fos = new FileOutputStream(new File("D:\\TestFile\\aaaa\\bbbb\\cccc\\b.txt"),true);
       fos.write("你好".getBytes());//把字符串转换为字节数组
       fos.write("\r\n".getBytes());//写入换行符号
       fos.close();

    }
}
