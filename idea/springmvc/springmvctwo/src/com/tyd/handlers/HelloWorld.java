package com.tyd.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Abbot on 2017-01-16 0016 10:38:30.
 */
@Controller
@RequestMapping("yes" )
public class HelloWorld
{

    @RequestMapping(value = "haha",method = RequestMethod.GET)
    /**
     * 前台请求的参数不能带空格，以及任何和后台中的@RequestParam中的参数一样的信息
     */
    String hell(@RequestParam("a") String a, HttpServletRequest request)
    {
        System.out.println("yesyesyes");
        System.out.println();
        System.out.println(a);
        System.out.println();
       if(Math.random()>=0&& Math.random()<1)
       {
           System.out.println("OK!");

       }
       else
       {
           System.out.println("NO!");
       }
        request.setAttribute("drx", "xiaxia");
        return "a";
    }

    @RequestMapping("/y")
    public void computer(@RequestParam("num1") String num1,
                           @RequestParam("num2") String num2,
                           @RequestParam("flag") String flag,
                           HttpServletRequest request,
                           HttpServletResponse response) throws ServletException, IOException
    {
        long n1 = Long.parseLong(num1);
        long n2 = Long.parseLong(num2);
        int f = Integer.parseInt(flag);
        long result = 0;
        switch(f)
        {
            case 1:
                result = n1+n2;
                break;
            case 2:
                result = n1-n2;
                break;
            case 3:
                result = n1*n2;
                break;
            case 4:
                result = n1/n2;
                break;
            case 5:
                result = (long) Math.pow(n1,n2);
                break;
            case 6:
                result = (long) Math.pow(n1,1.0/n2);
                break;
            default:
                break;
        }
        request.setAttribute("result", result);
        request.getRequestDispatcher("/index1.jsp").forward(request, response);
    }


}
