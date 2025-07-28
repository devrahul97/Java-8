package july.Java8.javatechie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: "Rahul kumar"
 * @Created By: 27-07-2025 16:16
 * @project: java8coding
 */
public class DuplicateElementsFromGivenString {

    public static void main(String[] args) {

        String input = "ilovejavabackend";


        // Approach 1:
        Map<String, Long> collected = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collected);

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Long> pair: collected.entrySet()) {
            if(pair.getValue() >1){
                list.add(pair.getKey());
            }
        }

        System.out.println(list);

        // Approach 2:
        List<String> duplicateElements =  Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(ele -> ele.getValue() > 1)
                .map(Map.Entry::getKey)
                        .collect(Collectors.toList());

        System.out.println(duplicateElements);


    }
}
