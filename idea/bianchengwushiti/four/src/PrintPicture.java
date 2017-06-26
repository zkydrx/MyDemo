/**
 * Created by ZKY on 2017-05-16 9:28 PM.
 */
public class PrintPicture
{
    /**
     * print multiplication table
     */
    public void printChengFaBiao()
    {
        for (int i = 1; i < 10; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }

    /**
     * print square
     */
    public void printZhengFangXing()
    {
        for (int i = 1; i < 10; i++)
        {
            for (int j = 1; j < 20; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * print  rhombus
     */
    public void printLingXing()
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5 - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 4; i >= 1; i--)
        {
            for (int j = 1; j <= 5 - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        new PrintPicture().printChengFaBiao();
        new PrintPicture().printZhengFangXing();
        new PrintPicture().printLingXing();
    }
}
