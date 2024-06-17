package functional_interface;

import java.util.function.Predicate;

public class PredicateDemo{
    public static void main(String[] args) {
        Predicate<Integer> predicate = e -> (e % 2 == 0);
        boolean test = predicate.test(5);
        System.out.println(test);
    }
}
