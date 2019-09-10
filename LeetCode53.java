package LeetCode;

class LeetCode53 {
    public int maxSubArray(int[] nums) {
        int size = nums.length;
        int max = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        for (int i =0;i<size;i++){
            maxEndingHere += nums[i];
            if (max < maxEndingHere){
                max = maxEndingHere;
            }
            if (maxEndingHere < 0){
                maxEndingHere = 0;
            }
        }
        return max;
    }
}