/**
 * @author pickle
 * @Description:<p>我爱榨菜</p>
 */
public class Love
{

    private static volatile boolean isLove = true;

    public static final void love()
    {
        while (isLove)
        {
            System.out.println("I love you.");
            forever();
        }
    }

    private static void forever()
    {
        isLove = true;
    }

    public static void main(String[] args)
    {
        love();
    }
}