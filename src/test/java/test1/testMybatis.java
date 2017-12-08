//package test1;
//
//import cn.no1.dao.User;
//import cn.no1.mapper.UserMapper;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
///**
// * Created by cuibinbin on 2017/11/2.
// */
//public class testMybatis {
//    private ApplicationContext context;
//    @Before
//    public void init(){
//        this.context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
//    }
//
//    @Test
//    public void demo1(){
//        UserMapper userMapper = this.context.getBean(UserMapper.class);
//        System.out.println(userMapper.findById(2));
//    }
//}