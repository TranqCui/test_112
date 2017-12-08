package cn.springmvc.other;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by cuibinbin on 2017/11/13.
 */
public class AsyncCompleteServlet extends HttpServlet {
    private final static long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        super.doGet(req, resp);
        response.setContentType("text/html");
        final PrintWriter printWriter = response.getWriter();
        printWriter.println("11111");
        printWriter.println("<html><head><title>Async Servlet</title></head>");
        printWriter.println("<body><div id='progress'></div>");
        final AsyncContext asyncContext = request.startAsync();
        asyncContext.setTimeout(50000);
        asyncContext.start(() -> {
            System.out.println("new Thread:"+Thread.currentThread());
            for (int i = 0; i < 10; i++) {
                printWriter.println("<script>");
                printWriter.println("document.getElementById('progress').innerHTML = '"+(i*10)+"% complete'");
                printWriter.println("</script>");
                printWriter.flush();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            printWriter.println("<script>");
            printWriter.println("document.getElementById('progress').innerHTML = 'done!'");
            printWriter.println("</script>");
            printWriter.println("</body></html>");
            asyncContext.complete();
        });
    }
}
