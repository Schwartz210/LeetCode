package LeetCode;

class LeetCode153 {
    public int findMin(int[] nums) {
        int mark = nums[0];
        for (int i=1;i<nums.length;i++){
            if (nums[i] < mark){
                return nums[i];
            }
        }
        return nums[0];
    }
}
