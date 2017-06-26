import java.util.Date;

/**
 * Created by ZKY on 2017-05-27 3:40 PM.
 */
public class GPSAddress
{
    private String equipNo;
    private String lat;
    private String lon;
    private String voltage;
    private String province;
    private String city;
    private String distinct;
    private String roadName;
    private Date GPSTime;

    public String getEquipNo()
    {
        return equipNo;
    }

    public void setEquipNo(String equipNo)
    {
        this.equipNo = equipNo;
    }

    public String getLat()
    {
        return lat;
    }

    public void setLat(String lat)
    {
        this.lat = lat;
    }

    public String getLon()
    {
        return lon;
    }

    public void setLon(String lon)
    {
        this.lon = lon;
    }

    public String getVoltage()
    {
        return voltage;
    }

    public void setVoltage(String voltage)
    {
        this.voltage = voltage;
    }

    public String getProvince()
    {
        return province;
    }

    public void setProvince(String province)
    {
        this.province = province;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getDistinct()
    {
        return distinct;
    }

    public void setDistinct(String distinct)
    {
        this.distinct = distinct;
    }

    public String getRoadName()
    {
        return roadName;
    }

    public void setRoadName(String roadName)
    {
        this.roadName = roadName;
    }

    public Date getGPSTime()
    {
        return GPSTime;
    }

    public void setGPSTime(Date GPSTime)
    {
        this.GPSTime = GPSTime;
    }
}
