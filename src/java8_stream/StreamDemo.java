package java8_stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Ram", "Mohan", "Sita", "Ravan", "Bali");

        //using java7 interation
        for (String name : nameList){
            System.out.println(name);
        }

        //using index iteration
        for (int i=0; i < nameList.size(); i++){
            System.out.println(nameList.get(i));
        }

        //using foreach iteration
        nameList.forEach(System.out::println);

        //using stream
        nameList.stream()
                        .forEach(System.out::println);

        //print name starting with character "M"
        nameList.stream()
                .filter(s -> s.startsWith("M"))
                .forEach(System.out::println);
    }
}
