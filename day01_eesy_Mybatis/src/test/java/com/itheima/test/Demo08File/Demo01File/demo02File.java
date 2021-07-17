package com.itheima.test.Demo08File.Demo01File;

import java.io.File;
        /*路径:
        绝对路径:是一个完整的路 以盘符开始的路径
        相对路径:是一个简化路径
        */
//主要讲述File类的构造方法
public class demo02File {
    public static void main(String[] args) {

        show01();
       //show02("c://","abc.txt");
        show02("D://","hello.txt");
        show03();

    }
    /*File(String Pathname) 构造方法 通过将给定路径名 字符串转换为抽象路径名来创建一个新File实例
    * 参数:
    * String pathname:字符串的路径名称
    * 路径可以是以文件结尾，也可以是以文件夹结尾
    * 路径可以是相对路径，也可以是绝对路径
    * 路径可以是真实存在的也可以是不存在的(虚假的)
    * 创建file对象，只是把字符串路径封装为file对象,不考虑路径真假情况
    *
    * */

    public  static  void  show01(){
        File file = new File("C:\\Program Files\\Google");
        System.out.println(file);//重写了obj类tostring方法 对象打印路径

        File file1 = new File("b.txt");
        System.out.println(file1);//重写了obj类tostring方法 对象打印路径


    }
/*File(String parent ,String child) 根据parent路径名字符串和chile路径名字符串创建一个新file对象
* 参数:把路径分成两部分
* String Parent:父路径
* String child:子路径
* 好处:
* 子路径和父路径可以单独书写,使用非常灵活,都可以进行变化
* */
    public  static  void  show02( String parent , String child) {

       File file = new File(parent,child);
        System.out.println(file);
    }

            /*File(File parent ,String child) 根据parent路径名字符串和chile路径名字符串创建一个新file对象
             * 参数:把路径分成两部分
             * String Parent:父路径
             * String child:子路径
             * 好处:
             * 子路径和父路径可以单独书写,使用非常灵活,都可以进行变化
             * 父路径是File类型，可以使用File方法对路径进行操作，在使用路径创建对象
             * */
    public  static  void  show03( ) {

                File parent1= new File("c://");
                File file = new File(parent1,"hello.java");
                System.out.println(file);
                System.out.println(parent1);
            }

}
