import java.util.*;
import java.util.stream.*;
public class PowerSetWithReduce {
    public static <T> List<List<T>> powerSet(List<T> original) {
        return original.stream()
                .reduce(
                        Collections.singletonList(Collections.emptyList()),
                        (acc, elem) -> {
                            List<List<T>> next = new ArrayList<>();
                            for (List<T> subset : acc) {
                                next.add(subset);
                                List<T> extended = new ArrayList<>(subset);
                                extended.add(elem);
                                next.add(extended);
                            }
                            return next;
                        },
                        (a, b) -> {
                            List<List<T>> combined = new ArrayList<>(a);
                            combined.addAll(b);
                            return combined;
                        }
                );
    }

    public static void main(String[] args) {
        List<Integer> input1 = Arrays.asList(1, 2);
        List<Integer> input2 = Arrays.asList(1, 2, 3);

        System.out.println("Hatványhalmaz (1, 2):");
        System.out.println(powerSet(input1));

        System.out.println("Hatványhalmaz (1, 2, 3):");
        System.out.println(powerSet(input2));
    }
}
