import java.util.Scanner;

/**
 * 计算斐波那契数列(Fibonacci)的第n个值
 * Created by Abbot on 2017-01-19 0019 11:17:01.
 *
 */
public class Fibonacci2
{
    public static void main(String[] args)
    {
        int n = new Scanner(System.in).nextInt();
        int n1 = 1;
        int n2 = 1;
        int sum = 0;
        if (n <= 0)
        {
            System.out.println("参数错误");
            return;
        }
        if (n <= 2)
        {
            sum = 1;
        }
        else
        {
            for(int i = 3; i<=n; i++)
            {
                sum = n1+n2;
                n1 = n2;
                n2 = sum;
            }
        }
        System.out.println(sum);
    }
}
