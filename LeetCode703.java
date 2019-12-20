package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

class LeetCode703 {
    ArrayList<Integer> array;
    int index;
    public LeetCode703(int k, int[] nums) {
        index = k;
        array = new ArrayList<>();
        Arrays.sort(nums);
        for (int num:nums){
            array.add(num);
        }
    }

    public int add(int val) {
        for (int i=0;i<=array.size();i++){
            if (i == array.size()){
                array.add(val);
                break;
            }
            if (array.get(i) >= val){
                array.add(i, val);
                break;
            }
        }
        return array.get(array.size()-index);
    }
}
