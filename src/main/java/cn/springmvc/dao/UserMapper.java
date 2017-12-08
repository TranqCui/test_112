package cn.springmvc.dao;

import cn.springmvc.pojo.User;

import java.util.List;

/**
 * Created by cuibinbin on 2017/11/3.
 */
public interface UserMapper {
    List<User> findAll();
    User findById(int id);
    void update(User user);
    void insert(User user);
}
