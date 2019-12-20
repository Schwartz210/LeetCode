package LeetCode;

import java.util.HashMap;

class LeetCode1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        String[] keys = new String[dominoes.length];
        int writeIndex = 0;
        for (int[] d:dominoes){
            keys[writeIndex] = makeKey(d);
            ++writeIndex;
        }
        HashMap<String, Integer> map = getFrequencyMap(keys);
        int count = 0;
        int value;
        for (HashMap.Entry e:map.entrySet()){
            value = (int) e.getValue();
            if (value > 1){
                count += value * (value-1) / 2;
            }
        }
        return count;
    }

    private String makeKey(int[] domino){
        String key;
        if (domino[0] > domino[1]){
            key = domino[0] + "|" + domino[1];
        } else {
            key = domino[1] + "|" + domino[0];
        }
        return key;
    }

    private HashMap<String, Integer> getFrequencyMap(String[] keys){
        HashMap<String, Integer> map = new HashMap<>();
        for (String key:keys){
            if (map.containsKey(key)){
                map.put(key, map.get(key)+1);
            } else {
                map.put(key, 1);
            }
        }
        return map;
    }
}
