package cn.springmvc.service;

import cn.springmvc.dao.UserMapper;
import cn.springmvc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cuibinbin on 2017/11/3.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }
}
