/**
 * Created by ZKY on 2017-05-09 1:24 PM.
 */
public class SubBox extends Box
{
    public int color;
    public double weight;

    public double getArea(int length,int width,int height)
    {
        return (length*width+length*height+width*height)*2;
    }


}
