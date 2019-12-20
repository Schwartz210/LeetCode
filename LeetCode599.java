package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class LeetCode599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashSet<String> set1 = listToSet(list1);
        HashSet<String> set2 = listToSet(list2);
        HashSet<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        HashMap<String, Integer> map = new HashMap<>();
        for (String elem:intersection){
            map.put(elem, indexOf(elem, list1)+indexOf(elem, list2));
        }
        int min = Integer.MAX_VALUE;
        int minCount = 0;
        int value;
        for (Map.Entry e:map.entrySet()){
            value = (int) e.getValue();
            if (value < min){
                min = value;
                minCount = 1;
            } else if (value == min){
                minCount++;
            }
        }
        String[] result = new String[minCount];
        int writeIndex = 0;
        for (Map.Entry e:map.entrySet()){
            value = (int) e.getValue();
            if (value == min){
                result[writeIndex] = (String) e.getKey();
                writeIndex++;
            }
        }
        return result;
    }

    private HashSet<String> listToSet(String[] list){
        HashSet<String> set = new HashSet<>();
        for (String string:list){
            set.add(string);
        }
        return set;
    }

    private int indexOf(String string, String[] array){
        for (int i=0;i<array.length;i++){
            if (array[i].equals(string)){
                return i;
            }
        }
        return -1;
    }
}