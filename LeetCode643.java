package LeetCode;

class LeetCode643 {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = left + k;
        int sum = startSum(nums, k);
        double maxAverage = sum / (double) k;
        while (right < nums.length){
            sum -= nums[left];
            sum += nums[right];
            if (sum / (double) k > maxAverage){
                maxAverage = sum / (double) k;
            }
            left++;
            right = left + k;
        }
        return maxAverage;
    }

    private int startSum(int[] array, int k){
        int sum = 0;
        for (int i=0;i<k;i++){
            sum += array[i];
        }
        return sum;
    }
}