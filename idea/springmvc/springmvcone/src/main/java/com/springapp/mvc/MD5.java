package com.springapp.mvc;

import java.security.MessageDigest;

/**
 * Created by Abbot on 2017-01-10 0010 09:28:19.
 */
public class MD5
{
    private final static String[] stringDigits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    public MD5()
    {
    }

    /**
     * 返回形式为数字跟字符串。
     *
     * @param bByte
     * @return
     */
    private static String byteToArrayString(byte bByte)
    {
        int iRet = bByte;
        if (iRet < 0)
        {
            iRet += 256;
        }
        int iD1 = iRet / 16;
        int iD2 = iRet % 16;
        return stringDigits[iD1] + stringDigits[iD2];
    }


    /**
     * 返回只为数字形式
     *
     * @param bByte
     * @return
     */
    private static String byteToNum(byte bByte)
    {
        int iRet = bByte;
        System.out.println("iRet1 = " + iRet);
        if (iRet < 0)
        {
            iRet += 256;
        }
        return String.valueOf(iRet);
    }

    /**
     * 转换字节数组为16进制字符串
     *
     * @param bByte
     * @return
     */
    private static String byteToString(byte[] bByte)
    {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bByte.length; i++)
        {
            stringBuffer.append(byteToArrayString(bByte[i]));
        }
        return stringBuffer.toString();
    }

    /**
     * 返回32位小写
     *
     * @param strObj
     * @return
     */
    public static String getMD5(String strObj)
    {
        String resultString = null;
        try
        {
            resultString = new String(strObj);
            MessageDigest md = MessageDigest.getInstance("MD5");
            /**
             * md.digest() 该函数返回值为存放哈希值结果的byte数组
             */
            resultString = byteToString(md.digest(strObj.getBytes()));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return resultString;
    }

    public static String getMD5Up(String strObj)
    {
        String resultString = null;
        try
        {
            resultString = new String(strObj);
            MessageDigest md = MessageDigest.getInstance("MD5");
            resultString = byteToString(md.digest(strObj.getBytes()));
            StringBuffer stringBuffer = new StringBuffer();

            for (int i = 0; i < resultString.length(); i++)
            {
                if(resultString.charAt(i) >='a' && resultString.charAt(i) <= 'z')
                {
                    stringBuffer.append((char)(resultString.charAt(i)-32));
                }
                else
                {
                    stringBuffer.append(resultString.charAt(i));
                }
            }
            resultString = stringBuffer.toString();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return  resultString;
    }

    public static void main(String[] args)
    {
        MD5 getMD5 = new MD5();
        System.out.println(Character.toChars('a' - 32));
        System.out.println("zky211zky@gmail.com :"+getMD5.getMD5(getMD5.getMD5("zky211502")));
        System.out.println("zkydrx@gmail.com :"+getMD5.getMD5(getMD5.getMD5("zky2115022012")));

    }
}