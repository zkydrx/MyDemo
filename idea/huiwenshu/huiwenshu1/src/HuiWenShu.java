/**
 * Created by ZKY on 2017-05-25 9:36 AM.
 */
public class HuiWenShu
{
    /**
     * 判断给定的数字是几位数，返回位数。
     * @param number
     * @return
     */
    public static int getDigit(long number)
    {
        int a = 0;
        while(number > 0)
        {
            number /= 10;
            a++;
        }
        return a;
    }

    /**
     * 判断一个数字是否是回文数，如果是返回真，否者返回假。
     * @param number
     * @return
     */
    public static boolean isHuiWen(long number)
    {
        long temp = number;
        long sum = 0;
        while(number > 0)
        {
            long a = number % 10;
            sum = sum*10 +a;
            number /= 10;
        }
        if(sum == temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        int digit = getDigit(1234);
        System.out.println(digit);
        boolean huiWen = isHuiWen(1221);
        System.out.println(huiWen);
    }
}
