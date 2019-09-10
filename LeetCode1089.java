package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LeetCode1089 {
    public void duplicateZeros(int[] arr) {
        int i = 0;
        while (i<arr.length){
            if (arr[i] == 0){
                shiftBackwards(arr, i);
                i++;
            }
            i++;
        }
    }

    private void shiftBackwards(int[] arr, int index){
        int i = arr.length-2;
        while (i > index){
            arr[i+1] = arr[i];
            i--;
        }
        i++;
        arr[i] = 0;
    }
}