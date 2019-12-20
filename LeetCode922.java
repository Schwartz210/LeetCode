package LeetCode;

import java.util.ArrayList;

class LeetCode922 {
    public int[] sortArrayByParityII(int[] A) {
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        for (int num:A){
            if (num % 2 == 0){
                evens.add(num);
            } else {
                odds.add(num);
            }
        }
        int readIndex = -1;
        for (int i=0;i<A.length;i++){
            if (i % 2 == 0){
                readIndex++;
                A[i] = evens.get(readIndex);
            } else {
                A[i] = odds.get(readIndex);
            }
        }
        return A;
    }
}