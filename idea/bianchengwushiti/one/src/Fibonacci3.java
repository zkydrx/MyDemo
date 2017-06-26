/**
 * Created by Abbot on 2017-01-19 0019 11:23:57.
 * 输出Fibonacci数列
 */
public class Fibonacci3
{
    public static void main(String[] args)
    {
        short i = 0,j= 1;
        do
        {
            if(i == 0)
            {
                System.out.print(j+",");
            }
            else
            {
                System.out.print("" + i + "," + j+",");
            }
            i = (short) (i+j);
            j = (short) (i+j);
        }while(i>0);

        System.out.println();

    }
}
