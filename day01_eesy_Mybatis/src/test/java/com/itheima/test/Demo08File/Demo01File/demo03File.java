package com.itheima.test.Demo08File.Demo01File;

import java.io.File;

public class demo03File {
    public static void main(String[] args) {
      //  getAbsolutePath();
//getPath();
//getName();
        length();
    }
public static void  getAbsolutePath(){
    File  file = new File("C:\\Program Files\\Google\\a.txt");
    String absolutePath = file.getAbsolutePath();
    System.out.println(absolutePath);  //C:\Program Files\Google\a.txt

    File file1 = new File("abc.txt");
    String absolutePath1 = file1.getAbsolutePath();
    System.out.println(absolutePath1);//getAbsolutePath()方法返回的都是绝对路径

    File file2 = new File("a.txt");
    String absolutePath2 = file2.getAbsolutePath();
    System.out.println(absolutePath2);//getAbsolutePath()方法返回的都是绝对路径
}
public  static  void getPath(){
        File file = new File("c:\\Users\\itcast\\IdeaProjects\\shungyuan\\a.txt");
        File file2 = new File("a.txt");
        String path1 =  file.getPath();
        System.out.println(path1);//c:\Users\itcast\IdeaProjects\shungyuan\a.txt
        String path2 =  file2.getPath();
        System.out.println(path2);//a.txt
        System.out.println(file);//c:\Users\itcast\IdeaProjects\shungyuan\a.txt  *toString方法调用了getPath();
}

/*
* public String getName():返回由此FiLe表示的文件或目录的名称。
* 获取的就是构造方法传递路径的结尾部分(文件/文件夹)
 */
public  static void getName(){
File file = new File("c:\\users\\itcast\\IdeaProjects\\shungyuan\\a.txt");
String Name = file.getName();
System.out.println(Name); //a.txt   *获取的就是构造方法传递路径的结尾部分(文件/文件夹)

}
/*
* public long length():返回由此FiLe表示的文件的长度。
* 获取的是构造方法指定的文件的大小,以字节为单位
注意:
文件夹是没有大小概念的,不能获取文件夹的大小
如果构造方法中给出的路径不存在，那么Length方法返回0
 */
public  static  void length(){
    File file = new File("D:\\TestFile\\abc.txt");
    long length = file.length();
    System.out.println(length);//以字节为单位
    File file1 = new File("D:\\TestFile\\a.txt");
    long length1 = file1.length();
    System.out.println(length1);//无该文件返回0
    File file2 = new File("D:\\TestFile\\a");
    System.out.println(file1.length());//文件夹无大小概念  返回0


}
}
