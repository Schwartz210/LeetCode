package LeetCode;



class LeetCode724 {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0){
            return -1;
        }
        int left, right;
        int index = -1;
        for (int i=0;i<nums.length;i++){
            left = rangeSum(nums, 0, i-1);
            right = rangeSum(nums, i+1, nums.length-1);
            if (left == right){
                index = i;
                break;
            }
        }
        return index;
    }

    private int rangeSum(int[] array, int startIndex, int endIndex){
        int total = 0;
        for (int i=startIndex;i<=endIndex;i++){
            total += array[i];
        }
        return total;
    }
}