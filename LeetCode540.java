package LeetCode;

public class LeetCode540 {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        for (int i=0;i<nums.length;i += 2){
            if (i == nums.length-1){
                return nums[i];
            } else if (nums[i] == nums[i+1]){
                continue;
            } else {
                if (nums[i+1] == nums[i+2]){
                    return nums[i];
                } else {
                    return nums[i+1];
                }
            }
        }
        return 0;
    }
}
