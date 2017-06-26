import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.*;

/**
 * Created by ZKY on 2017-05-31 9:47 AM.
 */
public class TestAll
{

    // json字符串转
    private static String diskListContent =
            "[{\"n1\":\"asd\",\"n2\":22,\"n3\":\"45.40GB\"," + "\"n4\":\"qwerty\",\"n5\":\"asd\",}," + "{\"n1\":\"local\","
                    + "\"n2\":1,\"n3\":\"279.40GB\",\"n4\":\"ST3300656SS\",\"n5\":\"\\/devm\\/d0\"}]";

    /***
     * json字符串转java List
     * @param rsContent
     * @return
     * @throws Exception
     */
    private static List<Map<String, String>> jsonStringToList(String rsContent) throws Exception
    {
        JSONArray arry = JSONArray.fromObject(rsContent);

        System.out.println("json字符串内容如下");
        System.out.println(arry);
        List<Map<String, String>> rsList = new ArrayList<Map<String, String>>();
        for (int i = 0; i < arry.size(); i++)
        {
            JSONObject jsonObject = arry.getJSONObject(i);
            Map<String, String> map = new HashMap<String, String>();
            for (Iterator<?> iter = jsonObject.keys(); iter.hasNext();)
            {
                String key = (String) iter.next();
                String value = jsonObject.get(key).toString();
                map.put(key, value);
            }
            rsList.add(map);
        }
        return rsList;
    }


    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception
    {
        List<Map<String, String>> list1 = jsonStringToList(diskListContent);
        System.out.println("json字符串成map");
        for (Map<String, String> m : list1)
        {
            System.out.println(m);
        }
        System.out.println("map转换成json字符串");
        for (Map<String, String> m : list1)
        {
            JSONArray jsonArray = JSONArray.fromObject(m);
            System.out.println(jsonArray.toString());

        }
        System.out.println("list转换成json字符串");
        JSONArray jsonArray2 = JSONArray.fromObject(list1);
        System.out.println(jsonArray2.toString());
    }
}
