package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListDemo {

    /**
     * Declare an arraylist
     * Add element
     * add element at specific index
     * Get element
     * Set element at a specific index
     * Delete element from an index
     * Size of the list
     * Loop/Iterate on the list
     * Sort the list
     * @param args
     */
    public static void main(String[] args) {

        //Declare an ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();

        //Add element to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        System.out.println("After adding element to the list: "+list);

        //Add element at specific index
        list.add(3,4);
        System.out.println("After adding element at specific index: "+list);

        //Get element
        int res = list.get(0);
        System.out.println("Get element at 0 index: "+res);

        //Set element at given position
        list.set(5,7);
        System.out.println("After setting a element at given position: "+list);

        //Delete an element
        int temp = list.remove(0);
        System.out.println("After removing 0th element: "+list);
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }

    }
}
