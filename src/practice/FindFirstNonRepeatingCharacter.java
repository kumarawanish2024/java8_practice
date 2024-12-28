package practice;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "leetcode";

        System.out.println(firstNonRepeatingCharacter(str));
    }

    public static char firstNonRepeatingCharacter(String str){
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : str.toCharArray()){
            if(map.get(c) == 1)
                return c;
        }
        return '1';
    }
}
