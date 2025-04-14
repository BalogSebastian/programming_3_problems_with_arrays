package problems_for_java_racket_arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryAdjustWithMap {
    public static List<Double> adjustSalaries(List<Double> salaries) {
        return salaries.stream()
                .map(salary -> {
                    if (salary < 100)
                        return Math.min(salary + salary * 0.2, 100);
                    else
                        return salary;
                })
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Double> salaries = Arrays.asList(80.0, 90.0, 100.0, 110.0);
        System.out.println(adjustSalaries(salaries));
    }
}
