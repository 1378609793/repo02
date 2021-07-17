package com.itheima.test.Demo08File.Demo01File;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.logging.FileHandler;

/*
FiLe类创建删除功能的方法
public boolean createNewFile():当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
public boolean delete() :删除由此FiLe表示的文件或文件夹。
public booLean mkdir() :创建由FiLe构造方法表示的目录。
public boolean mkdirs():创建由此File表示的目录，多级创建。
* */
public class demo05File {
    public static void main(String[] args) throws  Exception{
      //  show01();
       // show02();
        show03();
    }

    public static  void  show01() throws Exception{
        File file =  new File("D:\\TestFile\\abcd.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);

        File file2 =  new File("\\TestFile\\abcd2.txt");//相对路径创建
        boolean newFile2 = file2.createNewFile();
        System.out.println(newFile2);
    }
    /*
public boolean mkdir() :创建单级空文件夹
public boolean mkdirs() :既可以创建单级空文件夹,也可以创建多级文件夹
返回值:布尔值
true:文件夹不存在,创建文件夹,返回true
false:文件夹存在,不会创建,返回false;构造方法中给出的路径不存在返回false
* 注意:
1.此方法只能创建文件夹,不能创建文件
*/
    public static  void  show02(){

         File file = new File("D:\\TestFile\\aaaa");
        System.out.println(file.mkdir());

        File file1 = new File("D:\\TestFile\\aaaa\\bbbb\\cccc\\dddd");
        System.out.println(file1.mkdirs());

    }
/*
* public boolean delete() :删除由此FiLe表示的文件或目录。此方法,可以删除构造方法路径中给出的文件/文件夹
返回值:布尔值
true:文件/文件夹删除成功,返回true
false:文件夹中有内容,不会删除返回false;构造方法中路径不存在false
*注意:
delete方法是直接在硬盘删除文件/文件夹,不走回收站,删除要谨慎
*/
    public static  void  show03(){

        File file = new File("D:\\TestFile\\abcd.txt");
        System.out.println(file.delete());

        File file1 = new File("D:\\TestFile\\aaaa\\bbbb\\cccc\\dddd");
        System.out.println(file1.delete());

    }
}
