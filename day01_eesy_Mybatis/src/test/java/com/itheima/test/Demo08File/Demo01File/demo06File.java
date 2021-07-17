package com.itheima.test.Demo08File.Demo01File;

import com.sun.media.jfxmedia.events.NewFrameEvent;

import java.io.File;

public class demo06File {
    public static void main(String[] args) {
//show01();
        show02();
    }
/*
* public String[ ] list():返回一个String数组，表示该File目录中的所有子文件或目录。
遍历构造方法中给出的目录,会获取目录中所有文件/文件夹的名称,把获取到的多个名称存储到一个String类型的数组中
*/
    public  static  void show01(){
        File file = new  File("D:\\");//打印d盘所有一级根目录及其文件
        String[] list = file.list();
        for(String listsName:list){
            System.out.println(listsName);
        }
    }
    /*
    * public File[ ] listFiles():返回一个FiLe数组，表示该File目录中的所有的子文件或目录。
褊历构诰方法中给出的目录,会获取目录中所有的文件/文件夹,把文件/文件jia封装为FiLe对象,多个FiLe对象在储到File教组中
*/
    public  static  void show02(){
        File file = new  File("D:\\TestFile");
        File[] list = file.listFiles();
        for(File listsName:list){
            System.out.println(listsName);// D:\TestFile\aaaa
                                          // D:\TestFile\abc.txt
        }
    }
}
