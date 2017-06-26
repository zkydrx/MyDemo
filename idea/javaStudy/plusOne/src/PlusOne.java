import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ZKY on 2017-05-25 10:31 AM.
 * <p>
 * <p>
 * <p>
     * 给定一个非负数，表示一个数字数组，在该数的基础上+1，返回一个新的数组。
     * 该数字按照大小进行排列，最大的数在列表的最前面。
 * 样例
 * 给定 [1,2,3] 表示 123, 返回 [1,2,4].
 * 给定 [9,9,9] 表示 999, 返回 [1,0,0,0].
 */
public class PlusOne
{
    public int[] getTheArrays(int number)
    {
        number++;
        int count = 0;
        List<Integer> list = new ArrayList();
        while (number > 0)
        {
            int temp = number % 10;
            list.add(temp);
            number /= 10;
            count++;
        }
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++)
        {
            result[i] = list.get(result.length - 1 - i);
        }
        return result;
    }

    public int[] plusOne(int[] digits)
    {
        // Write your code here
        long sum = 0;
        for (int i = 0; i < digits.length; i++)
        {
            sum = sum * 10 + digits[i];
        }
        sum++;
        List<Long> list = new ArrayList<>();
        int count = 0;
        while (sum > 0)
        {
            list.add(sum % 10);
            sum /= 10;
            count++;
        }
        int[] temp = new int[count];

        for (int i = 0; i < temp.length; i++)
        {
            temp[i] = Integer.parseInt(String.valueOf(list.get(temp.length - 1 - i)));
        }
        return temp;
    }

    public static void main(String[] args)
    {
        int[] theArrays = new PlusOne().getTheArrays(999);
        System.out.println(Arrays.toString(theArrays));
        int [] a ={1,2,3,4,5,6,7};
        int [] b = new int[] {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(new PlusOne().plusOne(b)));
    }
}
