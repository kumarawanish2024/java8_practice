package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Not Found any Elements";

        List<String> list = Arrays.asList();
        String notFoundAnyElements = list.stream().findAny().orElseGet(supplier);
        System.out.println(notFoundAnyElements);

    }
}
