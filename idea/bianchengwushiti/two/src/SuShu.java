/**
 * Created by Abbot on 2017-01-20 0020 09:07:55.
 * 判断101-200之间有多少个素数，并输出所有素数。
 */
public class SuShu
{
    public void printfPrimer(int a,int b)
    {
        int count = 0;
        if(a <= b)
        {
            for (int i = a; i <= b; i++)
            {
                if(isPrimer(i))
                {
                    System.out.print(i+",");
                    count++;
                    if(count%5==0)
                    {
                        System.out.println();
                    }
                }
            }
        }
        else
        {
            System.out.println("输入有误！");
        }
    }

    /**
     * 判断一个数是否是素数
     * @param a
     * @return
     */
    public boolean isPrimer(int a)
    {
        boolean b = true;
        if(a == 1)
        {
            b = false;
        }
        else
        {
            for (int i = 2; i <= Math.sqrt(a); i++)
            {
                if(a %i ==0)
                {
                    b = false;
                    break;
                }
            }
        }
        return b;
    }

    public static void main(String[] args)
    {
        SuShu suShu = new SuShu();
        suShu.printfPrimer(101,200);
    }
}
