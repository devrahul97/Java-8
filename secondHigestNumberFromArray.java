package july.Java8.javatechie;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: "Rahul kumar"
 * @Created By: 28-07-2025 12:21
 * @project: java8coding
 *
 * Java Program to find the second higest number from a given Array
 */
public class secondHigestNumberFromArray {

    public static void main(String[] args) {
        int[] numbers = {5,9,11,2,8,21,1};

        Integer secondHigestNumber = Arrays.stream(numbers)
                .boxed()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondHigestNumber);
    }
}
