package problems_for_java_racket_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalaryAdjustNoMap {
    public static List<Double> adjustSalaries(List<Double> salaries) {
        List<Double> adjusted = new ArrayList<>();
        for (double salary : salaries) {
            if (salary < 100) {
                double newSalary = salary + salary * 0.2;
                adjusted.add(Math.min(newSalary, 100));
            } else {
                adjusted.add(salary);
            }
        }
        return adjusted;
    }

    public static void main(String[] args) {
        List<Double> salaries = Arrays.asList(80.0, 90.0, 100.0, 110.0);
        System.out.println(adjustSalaries(salaries));
    }
}
