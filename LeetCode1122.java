package LeetCode;

import java.util.*;

class LeetCode1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> array = new ArrayList<>();
        for (int num:arr2){
            set.add(num);
        }
        for (int num:arr1){
            if (!map.containsKey(num)){
                map.put(num, 1);
            } else {
                map.put(num, map.get(num)+1);
            }
            if (!set.contains(num)){
                array.add(num);
            }
        }
        Collections.sort(array);
        int frequency;
        int writeIndex = 0;
        for (int num:arr2){
            frequency = map.get(num);
            for (int i=0;i<frequency;i++){
                arr1[writeIndex] = num;
                writeIndex++;
            }
        }
        for (int num:array){
            arr1[writeIndex] = num;
            writeIndex++;
        }
        return arr1;
    }
}
