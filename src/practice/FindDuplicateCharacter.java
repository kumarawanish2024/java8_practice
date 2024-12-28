package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateCharacter {

    public static void main(String[] args) {

        System.out.println(findAllDuplicate("Hello dude"));
    }

    public static List<Character> findAllDuplicate(String str){
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();

        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : map.keySet()){
            if (map.get(c) > 1){
                list.add(c);
            }
        }
        return list;
    }
}
