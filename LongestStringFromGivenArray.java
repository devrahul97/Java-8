package july.Java8.javatechie;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author: "Rahul kumar"
 * @Created By: 28-07-2025 12:53
 * @project: java8coding
 *
 * find the Longest String From Given Array
 */
public class LongestStringFromGivenArray {

    public static void main(String[] args) {

        String[] strArray = {"java","rahul", "techie", "springboot", "microservices"};

        String longestString = Arrays.stream(strArray)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).orElse("");

        System.out.println(longestString);


    }
}
