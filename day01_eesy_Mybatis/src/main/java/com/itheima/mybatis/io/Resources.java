package com.itheima.mybatis.io;

import java.io.InputStream;

public class Resources {
//   根据传入参数  获取字节输入liu
    public  static InputStream  getResourcesAsStream(String  filePath){
        return Resources.class.getClassLoader().getResourceAsStream(filePath);

    }



}
