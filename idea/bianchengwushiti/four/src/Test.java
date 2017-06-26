import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZKY on 2017-05-17 5:05 PM.
 */
public class Test
{
    public static void main(String[] args)
    {
        List<Object> list  = new ArrayList<Object>();
        list.add("1234567");
        list.add("1111");
        list.add("2222");
        list.add("3333");

        StringBuffer appenEquipnos = new StringBuffer("");
        if(list.size() > 0)
        {
            for(int i = 0; i < list.size(); i++)
            {
                appenEquipnos.append(list.get(i)+",");
            }

        }

        String s = appenEquipnos.toString();
        System.out.println(s);
        String substring = s.substring(0, s.lastIndexOf(","));
        System.out.println(substring);
    }
}
