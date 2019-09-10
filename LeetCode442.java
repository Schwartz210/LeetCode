package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode442 {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> results = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n:nums){
            if (map.containsKey(n)){
                map.put(n, map.get(n)+1);
            } else {
                map.put(n, 1);
            }
        }
        int key, value;
        for (Map.Entry entry:map.entrySet()){
            key = (Integer) entry.getKey();
            value = (Integer) entry.getValue();
            if (value > 1){
                results.add(key);
            }
        }
        return results;
    }
}
