package cn.springmvc.controller;

import cn.springmvc.pojo.User;
import cn.springmvc.service.UserService;
import com.sun.javafx.sg.prism.NGShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

/**
 * Created by cuibinbin on 2017/11/3.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("userlist.action")
    public ModelAndView userList(){

//        int i = 1/0;
        List<User> list = userService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list",list);
        modelAndView.setViewName("userlist");
        return modelAndView;
    }

    @RequestMapping("detail.action")
    public ModelAndView findUser(HttpServletRequest request  ){
//    public ModelAndView toEdit(Integer id,
//                               HttpServletRequest request, HttpServletResponse response
//            , HttpSession session, Model model){
        String stId = request.getParameter("id");
        User user = userService.findById(Integer.parseInt(stId));
        ModelAndView modelAndView = new ModelAndView();

        System.out.println(user);

        modelAndView.addObject("user",user);
        modelAndView.setViewName("detail");
        return modelAndView;
    }

    @RequestMapping("update.action")
    public ModelAndView updateUser(User user){

        System.out.println(user);
        userService.update(user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping(value = "json.action")
    public @ResponseBody User
    json(@RequestBody User user){
        System.out.println(user);
        return user;
    }

    @RequestMapping("delete.action")
    public ModelAndView deletes(int[] ids){
        System.out.print(Arrays.toString(ids));
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("insert.action")
    public String insert(@ModelAttribute("user") User user){
        userService.insert(user);
        System.out.println(user);
        return "success";
    }

    @RequestMapping("test.action")
    public String test(){
        return "userlist1";
    }


    @ModelAttribute("user")
    public User getUser(){
        User user = new User();
        user.setId(0);
        return user;
    }
}
