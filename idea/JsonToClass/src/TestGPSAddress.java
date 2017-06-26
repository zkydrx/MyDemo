import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Created by ZKY on 2017-05-27 3:40 PM.
 */
public class TestGPSAddress
{
    @Test
    public void testGPS()
    {
        String jsonData = "[{\"id\":\"5\", \"version\":\"1.0\", \"name\":\"xiaowang\"},\n" + "{\"id\":\"10\", \"version\":\"2.0\", \"name\":\"lisi\"}]";
        Gson gson = new Gson();
        List<App> list = gson.fromJson(jsonData,new TypeToken<List<App>>(){}.getType());
        for(App app:list)
        {
            System.out.println(app.getId()+app.getName());
        }
    }
}
