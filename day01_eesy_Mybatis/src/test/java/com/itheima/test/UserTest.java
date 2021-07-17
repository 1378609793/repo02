package com.itheima.test;



import com.itheima.Dao.IUserDao;
import com.itheima.domain.User;

import com.itheima.mybatis.io.Resources;
import com.itheima.mybatis.sqlsession.SqlSession;
import com.itheima.mybatis.sqlsession.SqlSessionFactory;
import com.itheima.mybatis.sqlsession.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class UserTest {
    private InputStream in;
    private SqlSession sqlSession;
    private IUserDao iUserDao;

    @Before
    public void init() throws Exception {
        in = Resources.getResourcesAsStream("SqlMapConfig.xml");

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        SqlSessionFactory sqlSessionFactory = builder.builde(in);

        sqlSession = sqlSessionFactory.openSession();

        iUserDao = sqlSession.getMapper(IUserDao.class);

    }

    @After
    public void destory() throws Exception {
       // sqlSession.commit();
        sqlSession.close();
        in.close();
    }

    @Test
    public void finAII() {

        List<User> users = iUserDao.findAII();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void saveUser(){
        User user = new User();
        user.setUsername("xiaoli");
        user.setAddress("北京市");
        user.setBirthday(new Date());
        user.setSex("女");
        iUserDao.saveUser(user);

        System.out.println(user);
    }
   @Test
    public  void delete(){

            iUserDao.deleteUser(42);


}

    @Test
    public  void  updateUser(){

       User user =new User();
       user.setId(41);
       user.setUsername("张");
       user.setAddress("北京市");
       user.setSex("男");
       user.setBirthday(new Date());
       iUserDao.updateUser(user);

    }


    }






