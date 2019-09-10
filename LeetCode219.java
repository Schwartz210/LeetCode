package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class LeetCode219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> temp;
        for (int i=0;i<nums.length;i++){
            if (!map.containsKey(nums[i])){
                temp = new ArrayList<>();
                temp.add(i);
                map.put(nums[i], temp);
            } else {
                map.get(nums[i]).add(i);
            }
        }
        for (Map.Entry e:map.entrySet()){
            temp = (ArrayList<Integer>) e.getValue();
            for (int i=0;i<temp.size()-1;i++){
                if (temp.get(i+1) - temp.get(i) <= k){
                    return true;
                }
            }
        }
        return false;
    }
}
