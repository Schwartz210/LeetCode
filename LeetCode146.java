package LeetCode;

import java.util.HashMap;
import java.util.Map;


class LeetCode146 {
    private int orderNum = 0;
    private int cap;
    private HashMap<Integer, Integer> mainMap;
    private HashMap<Integer, Integer> orderMap;
    public LeetCode146(int capacity) {
        mainMap = new HashMap<>();
        orderMap = new HashMap<>();
        cap = capacity;
    }

    public int get(int key) {
        if (mainMap.containsKey(key)){
            orderNum++;
            orderMap.put(key, orderNum);
            return mainMap.get(key);
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (!mainMap.containsKey(key) && cap - mainMap.size() == 0){ //must add, no space
            deleteLRUKey();
        }
        mainMap.put(key, value);
        orderNum++;
        orderMap.put(key, orderNum);
    }

    private void deleteLRUKey(){
        int minKey = 0;
        int minValue = Integer.MAX_VALUE;
        int value;
        for (Map.Entry e:orderMap.entrySet()){
            value = (int) e.getValue();
            if (value < minValue){
                minKey = (int) e.getKey();
                minValue = (int) e.getValue();
            }
        }
        orderMap.remove(minKey);
        mainMap.remove(minKey);
    }
}
