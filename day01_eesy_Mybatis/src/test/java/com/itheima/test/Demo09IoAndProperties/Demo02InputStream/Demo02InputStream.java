package com.itheima.test.Demo09IoAndProperties.Demo02InputStream;

import java.io.FileInputStream;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Demo02InputStream {
    public static void main(String[] args) throws  Exception{
        FileInputStream fis = new FileInputStream( "D:\\TestFile\\aaaa\\bbbb\\cccc\\a.txt");
        byte[] bytes = new byte[1024];
      /*  int read = fis.read(bytes);*/
       /* System.out.println(Arrays.toString(bytes));//[49, 50, 51]数组中字节的值*/
     /*   System.out.println(new String(bytes));
        System.out.println(read);// 代表数组中有几个字节
*/
/*
        System.out.println(len);    2.Len = fis.read():把读取到的字节赋值给变量Len
                                    3.((Len = fis.read( )) !=-1 ) :判断变量len是否不等于-1
        System.out.println(Arrays.toString(bytes));//遍历数组49, 65,
        System.out.println(new String(bytes));//1ABC*///遍历

//        while ((len = fis.read(bytes)) != -1){
//            ///String(bytel1 bytes, int offset，int length）)把字节数组的一部分转换为字符串offset :数组的开始索引 lenth:只转当前有效的字节
//            System.out.println(new String(bytes,0,len));//1ABC*///遍历
//        }
        int len = 0;
        while ((len = fis.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }
}
