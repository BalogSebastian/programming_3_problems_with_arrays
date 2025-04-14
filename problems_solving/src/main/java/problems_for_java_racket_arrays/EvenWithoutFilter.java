package problems_for_java_racket_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenWithoutFilter {
    public static List<Integer> evenElements(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int num : list) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(evenElements(numbers));
    }
}
