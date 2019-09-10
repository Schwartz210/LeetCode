package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class LeetCode448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> results = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int num:nums){
            set.add(num);
        }
        for (int i=1;i<=nums.length;i++){
            if (!set.contains(i)){
                results.add(i);
            }
        }
        return results;
    }
}