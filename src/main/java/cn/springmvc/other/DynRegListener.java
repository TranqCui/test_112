package cn.springmvc.other;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

/**
 * Created by cuibinbin on 2017/11/14.
 */
@WebListener
public class DynRegListener implements ServletContextListener {
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        Servlet firstServlet = null;
        try {
            //动态创建web对象
            firstServlet = servletContext.createServlet(FirstServlet.class);
        } catch (ServletException e) {
            e.printStackTrace();
        }
        //
        if (firstServlet!=null && firstServlet instanceof FirstServlet){
            ((FirstServlet) firstServlet).setName("Dynamically registered servlet");
        }
        //注册到servlet上下文中
        ServletRegistration.Dynamic dynamic = servletContext.addServlet("firstServlet", firstServlet);
        dynamic.addMapping("/dynamic");
    }
}
