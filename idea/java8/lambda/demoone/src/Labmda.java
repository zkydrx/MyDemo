import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * demoone.${PACKAGE-NAME}
 * Created by ZKY on 2017-01-05-005 10:44:25.
 */
public class Labmda
{
    public static void main(String[] args)
    {
        /**
         * prior java 8
         */
        List<String> list = Arrays.asList("a", "b", "c");
        for (String feature:list)
        {
            System.out.println(feature);
        }
        /**
         * In java 8
         */
        List<String> list1 = Arrays.asList("d","e","f");
        list1.forEach(n -> System.out.println(n));


        /**
         * Without lambda expressions
         */
        List<Integer> list2 = Arrays.asList(100,200,300,400,500);
        for (Integer cost:list2)
        {
            double price = cost +.12*cost;
            System.out.println(price);
        }

        /**
         * With lambda expression
         */
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        costBeforeTax.stream().map((cost) -> cost + .12 * cost).forEach(System.out::println);

    }
}
