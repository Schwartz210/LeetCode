package LeetCode;

import java.util.ArrayList;
import java.util.List;

class LeetCode118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results = new ArrayList<>();
        ArrayList<Integer> row;
        int cellCount = 1;
        for (int i=0;i<numRows;i++){
            row = new ArrayList<>();
            for (int j=0;j<cellCount;j++){
                if (j == 0 || j == cellCount - 1){
                    row.add(1);
                } else {
                    row.add(results.get(i-1).get(j-1)+results.get(i-1).get(j));
                }
            }
            results.add(row);
            cellCount++;
        }
        return results;
    }
}