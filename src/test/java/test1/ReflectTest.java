package test1;

import cn.springmvc.pojo.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by cuibinbin on 2017/11/7.
 */
public class ReflectTest {
    public static User construct() throws Throwable{
        //获得当前线程的类装载器
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class clazz = classLoader.loadClass("cn.springmvc.pojo.User");

        // 获取类的构造对象，并实例化User
        Constructor cons = clazz.getDeclaredConstructor((Class[])null);
        User user = (User) cons.newInstance();

        //通过反射获得属性
        clazz.getMethod("setUsername",String.class).invoke(user, "吃饭");
        clazz.getMethod("setId",int.class).invoke(user, 30);
        clazz.getMethod("setMoney",double.class).invoke(user, 40000.0);
        return user;
    }

    public static void main(String[] args)throws Throwable{
        User user = construct();
        System.out.println(user);
    }

}
