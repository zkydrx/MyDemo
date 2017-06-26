package test;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;


/**
 * Created by ZKY on 2017-06-15 10:50.
 */
public class AtUnitExample1
{
    public String methodOne()
    {
        return "This is methodOne";
    }

    public int methodTwo()
    {
        System.out.println("This is methodTwo");
        return 2;
    }

    @Test
    void assertExample()
    {
        assert methodOne().equals("This is methodOne");
    }

    @Test
    void assertFailureExample()
    {
        assert 1 == 2 : "What a surprise!";
    }

    @Test
    void exceptionExample() throws IOException
    {
        new FileInputStream("nofile.txt"); // Throws
    }

    @Test
    boolean assertAndReturn()
    {
        // Assertion with message:
        assert methodTwo() == 2 : "methodTwo must equal 2";
        return methodOne().equals("This is methodOne");
    }
    //    public static void main(String[] args) throws Exception {
    //        OSExecute.command(
    //                "java net.mindview.atunit.AtUnit AtUnitExample2");
    //    }


}
