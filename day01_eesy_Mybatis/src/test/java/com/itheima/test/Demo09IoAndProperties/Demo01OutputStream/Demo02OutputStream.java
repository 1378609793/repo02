package com.itheima.test.Demo09IoAndProperties.Demo01OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;

public class Demo02OutputStream {
    public static void main(String[] args)throws  Exception {
        FileOutputStream  fos = new FileOutputStream(new File("D:\\TestFile\\aaaa\\bbbb\\cccc\\b.txt"),false);
    //    fos.write(49);
        byte[] bytes = {-65,66,67,68,69};
        fos.write(bytes);
/*
* public void write(byte[] b, int off , int len):把字节数组的一部分写入到文件中
int off:数组的开始素引
int len:写几个字节
*/
        fos.write(bytes,1,3);

        byte[] bytes1 = "你好".getBytes();//把字符串转为字节数组
        System.out.println(Arrays.toString(bytes1));//[-28, -67, -96, -27, -91, -67] utf - 8编码一个汉字3个字节，GBK是两个字节
        fos.write(bytes1);


    }
}
