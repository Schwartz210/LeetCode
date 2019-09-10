package LeetCode;

import java.util.HashSet;

class LeetCode136 {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num:nums){
            if (!set.contains(num)){
                set.add(num);
            } else {
                set.remove(num);
            }
        }
        return (int) set.toArray()[0];
    }
}