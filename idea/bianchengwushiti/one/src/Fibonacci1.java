/**
 *
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一
 * 对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * 1.程序分析：兔子的规律为数列1,1,2,3,5,8,13,21....
 * 递归方法：缺点性能极差。优点代码量少。
 */
public class Fibonacci1
{
    public int fibo(int i)
    {
        if(i == 1||i==2)
        {
            return 1;
        }
        else
        {
            return fibo(i-1)+fibo(i-2);
        }
    }

    public static void main(String[] args)
    {
        Fibonacci1 fibonacci = new Fibonacci1();
        int fibo = fibonacci.fibo(1);
        int fibo1 = fibonacci.fibo(2);
        int fibo2 = fibonacci.fibo(3);
        int fibo3 = fibonacci.fibo(4);
        int fibo4 = fibonacci.fibo(5);
        int fibo5 = fibonacci.fibo(6);
        System.out.println(fibo);
        System.out.println(fibo1);
        System.out.println(fibo2);
        System.out.println(fibo3);
        System.out.println(fibo4);
        System.out.println(fibo5);
    }

}
