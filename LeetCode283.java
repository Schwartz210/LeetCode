package LeetCode;

class LeetCode283 {
    public void moveZeroes(int[] nums) {
        int indexofBlock = nums.length;
        for (int i=nums.length-1;i>=0;i--){
            if (nums[i] == 0){
                shift(nums, i, indexofBlock);
                indexofBlock--;
            }
        }
    }

    private void shift(int[] nums, int indexOfZero, int indexofBlock){
        for (int i=indexOfZero;i<indexofBlock-1;i++){
            nums[i] = nums[i+1];
        }
        nums[indexofBlock-1] = 0;
    }
}