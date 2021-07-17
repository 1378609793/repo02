package com.itheima.test.Demo08File.Demo01File;

import java.io.File;

/*file类文件和目录路径的抽象表示形式:
java把电脑文件和文件目录封装为file类,可以使用file类进行操作
我们可以使用FiLe类的方法
创建一个文件夹
删除文件夹
获取文件夹
判断文件夹
文件夹是否存在对文件夹进行遍历
获取文件的大小
File类是一个与系统无关的类,任何的操作系统都可以使用这个类中的方法

file:文件
directory:文件夹/目录
path :路径
*/
public class demo01File {


    /*
    重点记住这三个单词
      file:文件
    * directory:文件夹/目录
    * path:路径*/
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//查询路径分隔符 win是;linux 是：

        String separator = File.separator;
        System.out.println(separator);  //文件分隔符

    }
}
