package july.Java8.javatechie;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author: "Rahul kumar"
 * @Created By: 28-07-2025 11:54
 * @project: java8coding
 */
public class UniqueElementsInString {

    public static void main(String[] args) {

        String input = "ilovesoftwaredevelopement";

        List<String> uniqueElements = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .map(ele -> ele.getKey())
                .collect(Collectors.toList());

        System.out.println(uniqueElements);
    }
}
