package LeetCode;

import java.util.Arrays;

class LeetCode628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int total = 1;
        for (int i=nums.length-3;i<nums.length;i++){
            total *= nums[i];
        }
        int alt = nums[0] * nums[1] * nums[nums.length-1];
        return Math.max(alt, total);
    }
}