package com.tyd.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Abbot on 2017-01-18 0018 10:48:49.
 */

public class Three
{
    private int num1;
    private int num2;
    private int flag;
    private int result;

    public int getNum1()
    {
        return num1;
    }

    public void setNum1(int num1)
    {
        this.num1 = num1;
    }

    public int getNum2()
    {
        return num2;
    }

    public void setNum2(int num2)
    {
        this.num2 = num2;
    }

    public int getFlag()
    {
        return flag;
    }

    public void setFlag(int flag)
    {
        this.flag = flag;
    }


    public int computer()
    {

        switch(flag)
        {
            case 1:
                result = num1+num2;
                break;
            case 2:
                result = num1+num2;
                break;
            case 3:
                result = num1+num2;
                break;
            case 4:
                result = num1+num2;
                break;
            default:
                break;
//            case 5:
//                result = (int) Math.pow(num1,num2);
//                break;
//            case 6:
//                result = (int) Math.pow(num1,1.0/num2);
//                break;
        }
        return result;
    }
}
