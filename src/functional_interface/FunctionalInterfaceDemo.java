package functional_interface;

@FunctionalInterface
interface Calculator {
//    void switchOn();
    int add(int num);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
//        Calculator calculator = () -> System.out.println("Switched On");
//        calculator.switchOn();

        Calculator add = e -> e + e;
        int res = add.add(5);
        System.out.println("Sum of two number is: " +res);
    }
}
