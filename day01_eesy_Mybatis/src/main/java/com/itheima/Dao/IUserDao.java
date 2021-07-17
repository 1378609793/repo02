package com.itheima.Dao;

import com.itheima.domain.User;

import java.util.List;

public interface IUserDao {
    List<User>  findAII();
    void  saveUser(User user);
    void  deleteUser(Integer id);
    void updateUser(User user);
}
