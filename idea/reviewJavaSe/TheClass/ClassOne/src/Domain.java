/**
 * Created by ZKY on 5/8/2017 5:42 PM.
 */
public class Domain
{
    public long jieCheng(int a)
    {
        if(a == 1 )
        {
            return a;
        }
        else
        {
            return a*jieCheng(a-1);
        }
    }

    public static void main(String[] args)
    {
        long l = new Domain().jieCheng(5);
        System.out.println(l
        );
    }
}
