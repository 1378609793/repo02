package com.itheima.test.Demo08File.Demo02Recursion;

import java.io.DataOutput;
import java.io.File;
import java.util.List;

public class demo03Recurison {
    public static void main(String[] args) {
        File file = new File("D:\\TestFile");
        getAllFile(file);
    }
    public  static  void getAllFile(File file) {
        File[] files = file.listFiles();
        for (File f : files ){
            System.out.println(f);
        }
    }
}
