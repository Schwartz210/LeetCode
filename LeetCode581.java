package LeetCode;

import java.util.Arrays;

class LeetCode581 {
    public int findUnsortedSubarray(int[] nums) {
        int[] sortedCopy = nums.clone();
        Arrays.sort(sortedCopy);
        int count = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i] == sortedCopy[i]){
                count++;
            } else {
                break;
            }
        }
        for (int i=nums.length-1;i>-1;i--){
            if (nums[i] == sortedCopy[i]){
                count++;
            } else {
                break;
            }
        }
        if (count > nums.length){
            return 0;
        } else {
            return nums.length-count;
        }

    }
}