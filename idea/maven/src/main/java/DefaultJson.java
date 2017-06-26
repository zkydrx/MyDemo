import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Created by ZKY on 2017-05-31 9:52 AM.
 */
public class DefaultJson
{

    public static void main(String[] args)
    {

        JSONObject jsonObject =JSONObject.fromObject("");

        System.out.println("success:"+jsonObject.get("success"));
        System.out.println("errorMsg:"+jsonObject.get("errorMsg"));

        System.err.println("total:"+jsonObject.getJSONObject("data").get("total"));

        JSONObject data = jsonObject.getJSONObject("data");
        JSONArray jsonArray = data.getJSONArray("row");
        JSONObject row = null;
        for (int i = 0; i < jsonArray.size(); i++) {
            row = jsonArray.getJSONObject(i);
            System.out.println("id:"+row.get("id"));
            System.out.println("workName:"+row.get("workName"));
            System.out.println("assigneeName:"+row.get("assigneeName"));
            System.out.println("name:"+row.get("name"));
            System.out.println("processInstanceInitiatorName:"+row.get("processInstanceInitiatorName"));
            System.out.println("processInstanceStartTime:"+row.get("processInstanceStartTime"));
            System.out.println("createTime:"+row.get("createTime"));
            System.out.println("dueDate:"+row.get("dueDate"));
        }

    }
}
