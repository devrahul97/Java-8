package july.Java8.javatechie;

import concept.coding.collection.playlist.MinPriorityQueue;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author: "Rahul kumar"
 * @Created By: 28-07-2025 12:00
 * @project: java8coding
 */
public class FirstNonRepeatElement {

    public static void main(String[] args) {

        String input = "ilovejavatechie";

        String firstNonRepeatElement = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(element -> element.getValue() == 1)
                .findFirst()
                .get()
                .getKey();

        System.out.println("Non Repeating Element: "+firstNonRepeatElement);
    }
}
