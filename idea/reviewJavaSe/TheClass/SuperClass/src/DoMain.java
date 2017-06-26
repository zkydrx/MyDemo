/**
 * Created by ZKY on 2017-05-09 1:27 PM.
 */
public class DoMain
{
    public static void main(String[] args)
    {
        Box box = new SubBox();
        SubBox subBox = new SubBox();
        double volume = box.getVolume(1, 2, 3);
        System.out.println(volume);
        double area = subBox.getArea(1, 2, 3);
        System.out.println(area);
    }
}
