package com.itheima.test.Demo09IoAndProperties.Demo02InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo01InputStream {
    public static void main(String[] args) throws  Exception {
        FileInputStream fis = new FileInputStream( "D:\\TestFile\\aaaa\\bbbb\\cccc\\b.txt");
      /* int read = fis.read();
        System.out.println(read);
         read = fis.read();
        System.out.println(read);
         read = fis.read();
        System.out.println(read);*/
        /*发现以上读取文件是一个重复的过程,所以可以使用循环优化不知道文件中有多少字节,
        使用whiLe循环
        whiLe循环结束条件,读取到-1的时候结束布尔表达式(Len = fis.read() )!=-1
       1.fis.read():读取一个字节
       2.Len = fis.read():把读取到的字节赋值给变量Len
       3.(Len = fis.read( ) )!=-1 :判断变量len是否不等于-1

        * */
        int len = 0;
        while ((len = fis.read())!=-1){
            System.out.println((char)len);
        }
        fis.close();
    }
}
