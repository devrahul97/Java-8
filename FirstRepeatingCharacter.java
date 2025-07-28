package july.Java8.javatechie;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author: "Rahul kumar"
 * @Created By: 28-07-2025 12:10
 * @project: java8coding
 */
public class FirstRepeatingCharacter {

    public static void main(String[] args) {

        String input = "ilovejavatechie";

        String firstRepeatingCharacters = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(ele -> ele.getValue() > 1)
                .findFirst()
                .get()
                .getKey();

        System.out.println("first Repeating Characters: "+firstRepeatingCharacters);

    }
}
