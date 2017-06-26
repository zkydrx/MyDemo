import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ZKY on 2017-03-17 9:31.
 */
public class HelloWorld
{



    public static void main(String[] args)
    {
        User user = new User("zky");
        List<User> list = new ArrayList<>();
        list.add(user);
        User user1 =  new User("hys");
//        user.setName("hys");
        list.add(user1);
//        user.setName("z");
//        user.setPassword("p");
//        System.out.println("HelloWorld!");
//        int [] a = {1,2,3,4,5,6,7};
//        StringBuffer b = new StringBuffer();
//        for(int i = 0; i < a.length; i++)
//        {
//            b.append(a[i]);
//        }
//
//        String s = Arrays.toString(a);
//
//        System.out.println(b.toString());

        System.out.println(list.toString());

        System.out.println(list.toString().substring(1,list.toString().indexOf(",")));
        System.out.println(list.toString().substring(list.toString().indexOf(",")+1,list.toString().length()-1));
    }
}
