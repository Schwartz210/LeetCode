package LeetCode;

class LeetCode1287 {
    public int findSpecialInteger(int[] arr) {
        double max = arr.length * 0.25;
        int count = 0;
        for (int i=0;i<arr.length;i++){
            if (i == 0){
                count = 1;
            } else if (arr[i] == arr[i-1]){
                count++;
            } else {
                count = 1;
            }
            if (count > max){
                return arr[i];
            }
        }
        return -1;
    }
}