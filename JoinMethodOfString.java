package july.Java8.javatechie;

import java.util.Arrays;
import java.util.List;

/**
 * @author: "Rahul kumar"
 * @Created By: 28-07-2025 13:17
 * @project: java8coding
 *
 *
 * String.join() method
 */
public class JoinMethodOfString {

    public static void main(String[] args) {

        // String.join method
        List<String> numbers = Arrays.asList("1", "2", "3", "4");
        String result = String.join(",", numbers);

        System.out.println(result);
    }
}
