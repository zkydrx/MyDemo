import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ZKY on 2017-05-18 9:13 AM.
 */
public class TestTemp
{
    @Test
    public void test()
    {
        /**
         * 十分钟以前的日期格式时间
         */
        Date timeTemp = new Date();
        timeTemp.setTime(System.currentTimeMillis() - 10*60*60*1000);
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeChange = df.format(timeTemp);
        String btime =timeTemp.toString();
        System.out.println(timeChange);
    }
}
