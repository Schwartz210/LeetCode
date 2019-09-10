package LeetCode;

import java.util.HashSet;

class LeetCode287 {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int result = 0;
        for (int num:nums){
            if (set.contains(num)){
                result = num;
                break;
            } else {
                set.add(num);
            }
        }
        return result;
    }
}