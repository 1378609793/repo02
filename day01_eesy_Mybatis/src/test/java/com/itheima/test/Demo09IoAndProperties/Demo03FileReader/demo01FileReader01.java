package com.itheima.test.Demo09IoAndProperties.Demo03FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class demo01FileReader01 {
    public static void main(String[] args) throws  Exception{
        FileReader fileReader = new FileReader("D:\\TestFile\\aaaa\\bbbb\\cccc\\a.txt");
        int read = fileReader.read();//一次只能读取一个字节
        System.out.println(read);
         read = fileReader.read();//一次只能读取一个字节
        System.out.println(read);

      /*  int rea=0;
        char[] c = new char[10];
        while((rea = fileReader.read(c))!= -1){
            System.out.println(c);//12345你好
        }*/
   /*     FileReader fileReader = new FileReader("D:\\TestFile\\aaaa\\bbbb\\cccc\\a.txt");

        int  read = 0;
        char[] c = new char[10];
        while (fileReader.read(c)!= -1){
            System.out.println(c);
        }
*/
    }
}
