package javademo;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Abbot on 2017-02-07 0007 18:15:16.
 */
@WebServlet("/indexAction.action")
public class FirstServlet extends javax.servlet.http.HttpServlet
{
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws
            javax.servlet.ServletException, IOException
    {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws
            javax.servlet.ServletException, IOException
    {
        String name = request.getParameter("name");
        System.out.println(name);
        request.setAttribute("name", "google.com");
        request.getRequestDispatcher(request.getContextPath()+"/WEB-INF/page/abc.jsp").forward(request, response);
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.write("<h1>hello first servlet!</h1>");
    }
}
