package ajax.firstTest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by cuibinbin on 2017/12/6.
 */
@WebServlet(name = "JqueryServlet", urlPatterns = "/JqueryServlet")
public class JqueryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String age = request.getParameter("age");
//        System.out.println(name+":"+age);
//        int i = 1/0;
//        response.getWriter().write("success!");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("{\"name\":\"安徽\",\"age\":\"19\"}");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        System.out.println(name+":"+age);
//        response.getWriter().write("success!");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("{\"name\":\"二地方\",\"age\":\"19\"}");

    }
}
