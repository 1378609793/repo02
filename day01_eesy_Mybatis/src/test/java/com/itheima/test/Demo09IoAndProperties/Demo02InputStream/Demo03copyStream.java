package com.itheima.test.Demo09IoAndProperties.Demo02InputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo03copyStream {
    public static void main(String[] args)  throws  Exception{
        FileOutputStream fos = new FileOutputStream("D:\\TestFile\\aaaa\\bbbb\\a.txt");
        FileInputStream fis = new FileInputStream("c:\\a.txt");

        int len = 0 ;
        while ((len = fis.read()) != -1) {

            fos.write(len);
        }
        fos.close();
        fis.close();
    }
}
