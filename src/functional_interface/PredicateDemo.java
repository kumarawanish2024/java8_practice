package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = e -> (e % 2 == 0);
        boolean test = predicate.test(5);
        System.out.println(test);


        List<Integer> list = Arrays.asList(1, 2, 4, 6, 7, 8, 4, 3, 9, 5);
        list.stream()
                .filter(e -> e%2 == 0)
                .forEach(System.out::println);
    }
}
