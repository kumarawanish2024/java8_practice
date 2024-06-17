package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> integerConsumer = System.out::println;
        integerConsumer.accept(5);

        List<Integer> list = Arrays.asList(1, 2, 3, 6, 5, 7);
        //Here forEach is accepting a consumer value
        list.forEach(System.out::println);
    }
}
