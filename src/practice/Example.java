package practice;

import java.util.Arrays;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);
        for(Integer i : arr){
            System.out.println(i);
        }
    }
}

