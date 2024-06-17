package functional_interface;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> integerConsumer = System.out::println;
        integerConsumer.accept(5);
    }
}
