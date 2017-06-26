/**
 * Created by ZKY on 2017-05-23 1:22 PM.
 */
public class TestMain
{
    public static void main(String[] args)
    {
        String tmDoItemsTmp = "[";
        String item = "{prodId:'" + 1 + "',prodName:'" + 2 + "',prodMemo:'" + 3 + "',num:'" + 4 + "',numUnit:'" + 5 +
                "',weight:'" + 6 + "',cubage:'" + 7 + "',factoryId:'" + 8 + "',itemNum:'" + (9 + 1)
                + "'}";
        tmDoItemsTmp += item;
//        tmDoItemsTmp += ",";
        String  tmDoItems = tmDoItemsTmp.substring(0, tmDoItemsTmp.length());
        tmDoItems += "]";
        System.out.println(tmDoItems);

    }
}
