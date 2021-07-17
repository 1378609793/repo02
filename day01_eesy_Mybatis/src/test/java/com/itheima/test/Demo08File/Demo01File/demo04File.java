package com.itheima.test.Demo08File.Demo01File;

import java.io.File;

public class demo04File {
    public static void main(String[] args) {
//show01();
        show02();
    }

    /*
     public boolean exists( : 此FiLe表示目录是否实际存在。
     用于判断构造方法中的路径是否存在
             存在:true
             不存在:false
*/
    public  static  void  show01(){
        File file = new File("D:\\TestFile\\abc.txt");// 此FiLe表示的目录是否计算机实际存在。
        System.out.println(file.exists());// 存在:true

        File file1 = new File("abc.txt");//相对于D:\TestFile\根目录
        System.out.println(file.exists());// 存在:true

        File file2 = new File("abc1.txt");//构造方法中不存在的相对路径
        System.out.println(file2.exists());//false
    }

    /*
    * public boolean isDirectory() :此File表示的是否为目录。
用于判断构造方法中给定的路径是否以文件夹结尾
是:true
否:false
public boolean isFile() :此FiLe表示的是否为文件。
用于判断构造方法中给定的路径是否以文件结尾
是:true
否:false
注意:
电脑的硬盘中只有文件/文件夹,两个方法是互斥
这两个方法使用前提,路径必须是存在的，否则都返回faLse
*/
    public  static  void  show02(){
        File file = new File("D:\\TestFile\\abc.txt");// 此FiLe表示的目录是否计算机实际存在。
       if(file.exists()){
           System.out.println(file.isDirectory());//false  结尾有文件并非目录
           System.out.println(file.isFile());//true  结尾有文件
       }
        File file1 = new File("abc.txt");//相对于D:\TestFile\根目录
        System.out.println(file.exists());// 存在:true

        File file2 = new File("abc1.txt");//构造方法中不存在的相对路径
        System.out.println(file2.exists());//false
    }
}
