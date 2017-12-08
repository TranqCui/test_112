package cn.springmvc.controller;

import cn.springmvc.pojo.Items;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by cuibinbin on 2017/11/2.
 */
@Controller
public class ItemController {
    @RequestMapping("list.action")
    public ModelAndView ItmeList(){
        List<Items> arrayList = new ArrayList<>();
        arrayList.add(new Items("aa","male",20,40000,new Date()));
        arrayList.add(new Items("bb","male",32,53322,new Date()));
        arrayList.add(new Items("vv","male",12,22222,new Date()));
        arrayList.add(new Items("cc","male",22,11111,new Date()));
        arrayList.add(new Items("dd","male",24,33333,new Date()));
        arrayList.add(new Items("ss","male",14,44444,new Date()));


        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemList",arrayList);
//        modelAndView.setViewName("WEB-INF/jsp/test1.jsp");
        modelAndView.setViewName("test1");
        return modelAndView;

    }
}
