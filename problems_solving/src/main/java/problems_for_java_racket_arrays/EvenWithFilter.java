package problems_for_java_racket_arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenWithFilter {
    public static List<Integer> evenElements(List<Integer> list) {
        return list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(evenElements(numbers));
    }
}
