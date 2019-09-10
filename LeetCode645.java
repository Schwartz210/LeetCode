package LeetCode;

import java.util.HashSet;

class LeetCode645 {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int duplicateNumber = Integer.MIN_VALUE;
        int missingNumber = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num:nums){
            if (!set.contains(num)){
                set.add(num);
            } else {
                duplicateNumber = num;
            }
            if (num > max){
                max = num;
            }
        }
        for (int i=1;i<=max;i++){
            if (!set.contains(i)){
                missingNumber = i;
                break;
            }
        }
        if (missingNumber == Integer.MIN_VALUE){
            missingNumber = max + 1;
        }
        return new int[]{duplicateNumber, missingNumber};
    }
}