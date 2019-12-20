package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

class LeetCode1207 {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int elem:arr){
            if (map.containsKey(elem)){
                map.put(elem, map.get(elem)+1);
            } else {
                map.put(elem, 1);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        int value;
        for (HashMap.Entry e:map.entrySet()){
            value = (int) e.getValue();
            set.add(value);
        }
        return map.size() == set.size();
    }
}