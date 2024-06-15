package functional_interface;

import java.util.function.BiConsumer;

public class LambdaDemoBook{

    public static void main(String[] args) {
        LambdaDemoBook demoBook = new LambdaDemoBook();
        demoBook.add(5, 10);


        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a+b);

        biConsumer.accept(10, 15);
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }
}