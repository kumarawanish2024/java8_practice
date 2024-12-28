package practice;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {

    public static void main(String[] args) {
      //  System.out.println(areAnagrams("listen", "silent"));
        System.out.println(areAnagrams("hello", "helle"));
    }

    public static boolean areAnagrams(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : str1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()){
            if(!map.containsKey(c) || map.get(c) == 0){
                return false;
            }
            map.put(c, map.get(c) - 1);
        }

        return true;
    }
}
