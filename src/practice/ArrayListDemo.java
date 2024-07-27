package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        Vector<Integer> integers = new Vector<>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(22);

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
