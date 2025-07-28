package july.Java8.javatechie;

import java.util.stream.IntStream;

/**
 * @author: "Rahul kumar"
 * @Created By: 28-07-2025 13:22
 * @project: java8coding
 *
 * Skip & limit method use case based example
 */
public class SkipAndLimitMethod {

    public static void main(String[] args) {

        IntStream.rangeClosed(1, 10)
                .skip(4)
                .limit(7)
                .forEach(System.out::println);
    }

    // sort a list and Map
    // map() & flatMap example
}
