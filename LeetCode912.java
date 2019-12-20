package LeetCode;

import java.util.ArrayList;
import java.util.List;

class LeetCode912 {
    public List<Integer> sortArray(int[] nums) {
        sort(nums, 0, nums.length-1);
        ArrayList<Integer> results = new ArrayList<>();
        for (Integer elem:nums){
            results.add(elem);
        }
        return results;
    }

    private int partition(int[] array, int low, int high){
        int i = low - 1;
        int pivot = array[high];
        for (int j=low;j<high;j++){
            if (array[j] < pivot){
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, high);
        return i+1;
    }

    private void sort(int[] array, int low, int high){
        if (high > low){
            int pi = partition(array, low, high);
            sort(array, low, pi-1);
            sort(array, pi+1, high);
        }
    }

    private void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}