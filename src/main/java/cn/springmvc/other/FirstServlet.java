package cn.springmvc.other;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by cuibinbin on 2017/11/14.
 */
public class FirstServlet extends HttpServlet{
    private static final long servialVersionUID = 11L;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        super.doGet(req, resp);
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html><head><title>First Servlet</title></head><body>"+name+"</body></html>");
    }
}
