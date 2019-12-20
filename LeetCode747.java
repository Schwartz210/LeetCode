package LeetCode;

class LeetCode747 {
    public int dominantIndex(int[] nums) {
        int maxindex = max(nums);
        int maxNum = nums[maxindex];
        for (int num:nums){
            if (num > maxNum/2 && num != maxNum){
                return -1;
            }
        }
        return maxindex;
    }

    private int max(int[] array){
        int maxNum = -1;
        int maxIndex = -1;
        for (int i=0;i<array.length;i++){
            if (array[i] > maxNum){
                maxNum = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
