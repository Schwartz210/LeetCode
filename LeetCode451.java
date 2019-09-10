package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode451 {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        Character letter;
        for (int i=0;i<s.length();i++){
            letter = s.charAt(i);
            if (map.containsKey(letter)){
                map.put(letter, map.get(letter)+1);
            } else {
                map.put(letter, 1);
            }
        }
        int max = 0;
        Character maxKey = null;
        Character key;
        StringBuilder results = new StringBuilder();
        while (!map.isEmpty()){
            for (Map.Entry e:map.entrySet()){
                key = (Character) e.getKey();
                if (map.get(key) > max){
                    maxKey = key;
                    max = map.get(key);
                }
            }
            for (int i=0;i<max;i++){
                results.append(maxKey);
            }
            map.remove(maxKey);
            max = 0;
            maxKey = null;
        }
        return results.toString();
    }
}
