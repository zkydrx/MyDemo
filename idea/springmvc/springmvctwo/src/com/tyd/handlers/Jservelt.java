package com.tyd.handlers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Abbot on 2017-01-18 0018 08:55:06.
 */
public class Jservelt extends HttpServlet
{
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {

        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        String f = request.getParameter("flag");
        int flag = Integer.parseInt(f);
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int result = 0;
        System.out.println(num1+"----"+num2+"----"+f);
        switch(flag)
        {
            case 1:
                result = n1+n2;
                break;
            case 2:
                result = n1 -n2;
                break;
            case 3:
                result = n1*n2;
                break;
            case 4:
                result = n1/n2;
                break;
            default:
                break;
        }
        request.setAttribute("result",result);
        request.getRequestDispatcher(request.getContextPath()+"/index1.jsp").forward(request,response);
    }

    public  void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {

        doPost(request,response);
    }
}
