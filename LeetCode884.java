package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class LeetCode884 {
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> mapA = makeMap(A);
        HashMap<String, Integer> mapB = makeMap(B);
        HashSet<String> uncommon = new HashSet<>();
        compareAdd(uncommon, mapA, mapB);
        compareAdd(uncommon, mapB, mapA);
        String[] results = new String[uncommon.size()];
        int writeIndex = 0;
        for (String elem:uncommon){
            results[writeIndex] = elem;
            ++writeIndex;
        }
        return results;
    }

    private HashMap<String, Integer> makeMap(String text){
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (char letter:text.toCharArray()){
            if (letter == ' '){
                updateMap(map, sb.toString());
                sb = new StringBuilder();
            } else {
                sb.append(letter);
            }
        }
        updateMap(map, sb.toString());;
        return map;
    }

    private void updateMap(HashMap<String, Integer> map, String key){
        if (map.containsKey(key)){
            map.put(key, map.get(key)+1);
        } else {
            map.put(key, 1);
        }
    }

    private void compareAdd(HashSet<String> main, HashMap<String, Integer> map1, HashMap<String, Integer> map2){
        String key;
        Integer value;
        for (Map.Entry e:map1.entrySet()){
            value = (Integer) e.getValue();
            key = (String) e.getKey();
            if (!map2.containsKey(key) && value == 1){
                main.add(key);
            }
        }
    }
}
