package LeetCode;

class LeetCode307 {
    private int[] array;
    public LeetCode307(int[] nums) {
        array = nums;
    }

    public void update(int i, int val) {
        array[i] = val;
    }

    public int sumRange(int i, int j) {
        int total = 0;
        while (i <= j){
            total += array[i];
            i++;
        }
        return total;
    }
}