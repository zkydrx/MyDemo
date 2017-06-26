/**
 * Created by ZKY on 2017-05-11 8:10 PM.
 */
public class Dispatch
{
    public static void main(String[] args)
    {
        A a = new A();
        B b = new B();
        C c = new C();
        A d = new B();
        A e = new C();
        A r;
        r = a;
        r.callMe();
        r = b;
        r.callMe();
        r = c;
        r.callMe();

        d.callMe();
        e.callMe();
    }
}
