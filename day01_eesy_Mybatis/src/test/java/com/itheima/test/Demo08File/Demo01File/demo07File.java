package com.itheima.test.Demo08File.Demo01File;

import java.io.File;

public class demo07File {
    public static void main(String[] args) {
        File file = new File("D:\\TestFile");
        getAIIFile(file);
    }
    public static  void getAIIFile(File f){

        File[] files = f.listFiles();
        for (File file : files){

            if(file.isDirectory()){//isDirectory()判断是否还有文件夹
              //  System.out.println(file);
                getAIIFile(file);

            }else {
                /*
                //String name = file.getName();  //把file转换为字符串根据文件后缀名打印
                //String path = file.getPath();//把file转换为字符串根据文件后缀名打印
                String s = file.toString();//把file转换为字符串根据文件后缀名打印
                s = s.toLowerCase();//把字符串转为小写
                boolean b = s.endsWith(".java");
                if(b == true){
                    System.out.println(file);//没有文件夹就可以打印剩下的文件了
                }
            */
                //链式写法
                if(file.toString().toLowerCase().endsWith(".java")){
                    System.out.println(file);
                }
            }

        }


    }
}
