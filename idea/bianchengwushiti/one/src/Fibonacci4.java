/**
 * Created by Abbot on 2017-01-19 0019 11:32:34.
 * 用一位数组保存Fibonacci序列值
 */
public class Fibonacci4
{
    public static void main(String[] args)
    {
        int n = 25, i;
        int fib[] = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (i = 2; i < n; i++)
        {
            fib[i] = fib[i-1]+fib[i-2];
        }
        for(i= 1;i<fib.length;i++)
        {
            System.out.print(""+fib[i]+",");
        }

    }
}
