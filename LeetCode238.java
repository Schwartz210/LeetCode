package LeetCode;

class LeetCode238 {
    public int[] productExceptSelf(int[] nums) {
        int arrayProduct = 1;
        int zeroCount = 0;
        for (int num:nums){
            if (num == 0){
                zeroCount++;
            } else {
                arrayProduct *= num;
            }
        }
        int[] results = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            if (zeroCount == 0){
                results[i] = arrayProduct / nums[i];
            } else if (zeroCount == 1 && nums[i] == 0){
                results[i] = arrayProduct;
            } else if (zeroCount == 1 && nums[i] != 0){
                results[i] = 0;
            } else if (zeroCount > 1){
                results[i] = 0;
            }
        }
        return results;
    }
}