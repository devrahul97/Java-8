package july.Java8.javatechie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: "Rahul kumar"
 * @Created By: 28-07-2025 13:06
 * @project: java8coding
 *
 * Java Program to find all the elements form Array who stats with 1
 */
public class AllElementsWhoStartsWith1 {

    public static void main(String[] args) {

        int[] numbers = {20, 229, 27, 5, 9, 11, 2, 8, 21, 1,100, 31, 1009, 19};

        //String num[] = numbers.toString();

        List<String> list = Arrays.stream(numbers)
                .boxed()
                .map(ele -> ele.toString())
                .filter(ele -> ele.startsWith("2"))
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
