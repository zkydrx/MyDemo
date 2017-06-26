/**
 * Created by ZKY on 2017-05-25 9:24 AM.
 */
public class Solution
{
    private static Solution instance;
    private Solution(){}
    /**
     * @return: The same instance of this class every time
     */
    public static Solution getInstance() {
        // write your code here
        if (instance == null){
            instance = new Solution();
            return instance;
        }
        else
        {
            return instance;
        }
    }
}
