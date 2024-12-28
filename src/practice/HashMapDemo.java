package practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        //Creating a hashmap
        Map<String, Integer> map = new HashMap<>();

        //Adding elements
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);

        //printing the map
        System.out.println("Initial Value: "+map);

        //retrieving elements
        System.out.println("Value for one: "+map.get("one"));
        System.out.println("Value for five: "+map.get("five")); //Returns null

        //Checking if key or value exists
        System.out.println("Contains key 'two': "+map.containsKey("two"));
        System.out.println("Contains value '3': "+map.containsValue(3));

        //Removing an element
        map.remove("three");
        System.out.println("Map after removing 'three': "+map);

        //Iterating over keys and values
        System.out.println("Iterating over keys and values: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +" -> "+ entry.getValue());
        }

        //Replacing value for a key
        map.replace("one", 10);
        System.out.println("Map after replacing value for 'one': "+map);

        //merging values
        map.merge("one", 5, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("Map after merging value for 'one': "+map);

        //copying entries from another map
        HashMap<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("five", 5);
        map.putAll(anotherMap);
        System.out.println("Map after putting all the key and value from another map: "+map);

        //Clearing the map
        map.clear();
        System.out.println("Map after clear: "+map);

        //Check if map is empty or not
        System.out.println("Is map empty?: "+map.isEmpty());


    }
}
