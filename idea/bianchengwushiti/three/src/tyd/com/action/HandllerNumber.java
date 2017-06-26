package tyd.com.action;

/**
 * Created by Abbot on 2017-03-01 17:05.
 * 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，
 * 其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，
 * 因为153=1的三次方＋5的三次方＋3的三次方。
 * 1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 */
public class HandllerNumber
{
    /***
     * 判断一个数是否是水仙花数
     */
    public static boolean isShuiXianHua(long number)
    {
        long sum = 0;
        long temp = number;
        long temp1 = number;
        /**
         * 统计传入的数字的位数。
         */
        int count = 0;
        while(temp1 > 0)
        {
            count++;
            temp1 /= 10;
        }

        while(temp >0)
        {
            long a = temp % 10;
            temp /= 10;
            /**
             * 对剥离出来的每个数进行次方运算然后累加起来。
             */
            sum += Math.pow(a,count);

        }


        /**
         * 两轮循环结束以后对累加结果进行判断，如果等于传进来的数字，
         * 那么该数字就是水仙花数返回true,否者就不是水仙花数，返回false.
         */
        if(sum == number)
        {

            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * 打印给定区间的所有水仙花数。
     */
    public static void printfShuiXianHua(long a ,long b)
    {
        for(long i = a; i <= b; i++)
        {
            if(isShuiXianHua(i))
            {
                System.out.println(i);
            }
            else
            {
                continue;
            }
        }
    }

    public static void main(String[] args)
    {

        printfShuiXianHua(0,1000);
    }
}
