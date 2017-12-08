package cn.springmvc.exception;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by cuibinbin on 2017/11/4.
 */
public class CustomException implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, @Nullable Object o, Exception e) {
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.addObject("error","错误提示");
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
