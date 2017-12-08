package test1;

import cn.springmvc.pojo.User;
import cn.springmvc.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by cuibinbin on 2017/11/4.
 */
public class test11 {
    @Autowired
    private UserService userService;
    @Test
    public void demo(){
//        System.out.println(userService.findAll());
        List<User> list = userService.findAll();
        System.out.println(list);
    }
}
