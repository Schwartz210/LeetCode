package LeetCode;

import java.util.HashMap;
import java.util.Map;

class LeetCode961 {
    public int repeatedNTimes(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num:A){
            if (!map.containsKey(num)){
                map.put(num, 1);
            } else {
                map.put(num, map.get(num)+1);
            }
        }
        int max = 0;
        int maxKey = -1;
        int value;
        for (Map.Entry e:map.entrySet()){
            value = (int) e.getValue();
            if (value > max){
                max = value;
                maxKey = (int) e.getKey();
            }
        }
        return maxKey;
    }
}