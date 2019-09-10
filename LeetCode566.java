package LeetCode;

class LeetCode566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (r*c > nums.length*nums[0].length){
            return nums;
        }
        int[][] matrix = new int[r][c];
        int rowWriteIndex = 0;
        int colWriteIndex = 0;
        for (int rowReadIndex=0;rowReadIndex<nums.length;rowReadIndex++){
            for (int colReadIndex=0;colReadIndex<nums[0].length;colReadIndex++){
                if (colWriteIndex == c){
                    colWriteIndex = 0;
                    rowWriteIndex++;
                }
                matrix[rowWriteIndex][colWriteIndex] = nums[rowReadIndex][colReadIndex];
                colWriteIndex++;
            }
        }
        return matrix;
    }
}
