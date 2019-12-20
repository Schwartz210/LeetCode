package LeetCode;

import java.util.HashMap;
import java.util.Map;

class LeetCode383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map1 = getMap(ransomNote);
        HashMap<Character, Integer> map2 = getMap(magazine);
        int value;
        for (Map.Entry e:map1.entrySet()){
            value = (int) e.getValue();
            if (!map2.containsKey(e.getKey())){
                return false;
            } else if (value > map2.get(e.getKey())){
                return false;
            }
        }
        return true;
    }

    private HashMap<Character, Integer> getMap(String string){
        HashMap<Character, Integer> map = new HashMap<>();
        char letter;
        for (int i=0;i<string.length();i++){
            letter = string.charAt(i);
            if (!map.containsKey(letter)){
                map.put(letter, 1);
            } else {
                map.put(letter, map.get(letter)+1);
            }
        }
        return map;
    }
}