package com.itheima.test;

import com.itheima.Dao.IUserDao;
import com.itheima.domain.User;
import com.itheima.mybatis.io.Resources;
import com.itheima.mybatis.sqlsession.SqlSession;
import com.itheima.mybatis.sqlsession.SqlSessionFactory;
import com.itheima.mybatis.sqlsession.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    public static void main(String[] args) throws IOException {
       InputStream inputStream =  Resources.getResourcesAsStream("SqlMapConfig.xml");

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.builde(inputStream);

        SqlSession sqlSession =  sqlSessionFactory.openSession();

       IUserDao iUserDao =  sqlSession.getMapper(IUserDao.class);
       List<User> users = iUserDao.findAII();
       for (User user : users){
           System.out.println(user);
       }
       sqlSession.close();
       inputStream.close();
    }
}
