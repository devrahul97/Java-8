package july.Java8.javatechie;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author: "Rahul kumar"
 * @Created By: 27-07-2025 09:29
 * @project: java8coding
 */

/**
 Java program to count the Occurance of each Character in a given String
 input: ilovejavaandreact
 output: i=1, l=1, o=1, v=2, e=2, j=1, a=4, n=1, d=1, r=1, c=1, t=1
 **/
public class CountOccurancesOfCharacter {

    public static void main(String[] args) {

        String input = "ilovejavaandreact";
        String results[] = input.split("");

        // maintain the Order
        Map<String, Long> collect = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(collect);

        // random Order
        Map<String, Long> collect1 = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect1);

    }
}
