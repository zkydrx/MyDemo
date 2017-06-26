package com.tyd.testPattern.number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Abbot on 2017-02-21-0021 09:23.
 * 判断一个字符串是否为纯数字。
 */
public class TestNumber
{

    /**
     * 方法一.一般情况下使用*代表。*既能包括+也能包括？所以大部分情况下使用*来匹配。
     */
    public static void method1(String string)
    {
        String regex = "[0-9]+";//+代表一个或多个如[1],[123456789],[111]等。
        String regex1 = "[0-9]?";//?代表零个或一个如[1],[2],[]等。
        String regex2 = "[0-9]*";//*代表零个或多个[1],[1234],[]等。

        boolean matches = string.matches(regex);
        boolean matches1 = string.matches(regex1);
        boolean matches2 = string.matches(regex2);
        if(matches)
        {
            System.out.println("+代表一个或多个如[1],[123456789],[111]等:"+string+" 这是一个数字字符串");
        }
        else
        {
            System.out.println("+代表一个或多个如[1],[123456789],[111]等:"+string+" 这不是一个数字字符串");
        }

        if(matches1)
        {
            System.out.println("?代表零个或一个如[1],[2],[]等："+string+" 这是一个数字字符串");
        }
        else
        {
            System.out.println("?代表零个或一个如[1],[2],[]等:"+string+" 这不是是一个数字字符串");
        }
        if(matches2)
        {
            System.out.println("*代表零个或多个[1],[1234],[]等："+string+" 这是一个数字字符串");
        }
        else
        {
            System.out.println("*代表零个或多个[1],[1234],[]等:"+string+" 这不是是一个数字字符串");
        }
    }

    /**
     * 方法二是利用正则表达式来进行校验。
     * 标准正则流程。
     * 一是先声明正则表达字符串
     * 二是编译模板引擎
     * 三是建立匹配器匹配输入
     * 四是条件判断，符合就进入条件内部执行代码。
     */
    public static void method2(String string)
    {
        String regex = "[0-9]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        if(matcher.matches())
        {
            System.out.println(string+" this is a number.");
        }
        else
        {
            System.out.println(string+" this is't a number.");
        }
    }
    public static void main(String[] args)
    {
        method1("123");
        method1("");
        method1("a123");
        method1("1");
        method2("123");
        method2("");
        method2("a123");
        method2("1");
    }
}
