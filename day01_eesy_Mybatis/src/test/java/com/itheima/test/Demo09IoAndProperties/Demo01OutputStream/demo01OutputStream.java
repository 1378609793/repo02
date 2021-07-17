package com.itheima.test.Demo09IoAndProperties.Demo01OutputStream;

import java.io.FileOutputStream;

/*

java.io.OutputStream:此抽象类是字节输出流所有类的超类。定义了一些子类共性的成员方法:
- public void close():关闭此输出流并释放与此流相关联的任何系统资源。
- public void flush():刷新此输出流并强制任何缓冲的输出字节被写出。
- public void write(byte[] b):将b.length字节从指定的字节数组写入此输出流。
- public void write(byte[ ] b， int off, int Len):从指定的字节数组写入Len字节，从偏移量off开始输出到此输出流。
- public abstract void write(int b):将指定的字节输出流。

java.io.Fileoutputstream extends outputstream

Fileoutputstream:文件字节输出流  作用:把内存中的数据写入到硬盘的文件中

构造方法:
FileoutputStream ( String name)创建一个向具有指定名称的文件中写入数据的输出文件流。
FileoutputStream (File file)创建一个向指定File对象表示的文件中写入数据的文件输出流。
参数: 写入数据的目的
String name:目的地是一个文件的路径
File file:目的地是一个文件

构造方法的作用:
1.创建一个FiLeoutputStream对象
2.会根据构造方法中传递的文件/文件路径,创建一个空的文件3.会把FiLeoutputStream对象指向创建好的文件

* */
public class demo01OutputStream {
    public static void main(String[] args) throws Exception{

        FileOutputStream fos  =  new FileOutputStream("D:\\TestFile\\aaaa\\bbbb\\cccc\\a.txt");

        fos.write(49);/*写数据的时候,会把10进制的整数97,
         转换为二进制整数97fos.write(1100001);97-->1100001
         任意的文本编辑器(记事本,notepad++...)
         在打开文件的时候都会查询编码表把字节转换为宁符表示
0-127:查询ASCII表
       97-->a
       其他值:查询系统默认码表(中文系统GBK)
*/

        fos.close();

    }
}
