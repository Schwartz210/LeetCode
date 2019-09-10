package LeetCode;

import java.util.ArrayList;
import java.util.List;

class LeetCode119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev;
        List<Integer> current = null;
        int elemCount = 1;
        for (int i=0;i<=rowIndex;i++){
            prev = current;
            current = new ArrayList<>();
            for (int j=0;j<elemCount;j++){
                if (prev == null || j == 0 || j == elemCount-1){
                    current.add(1);
                } else {
                    current.add(prev.get(j)+prev.get(j-1));
                }
            }
            elemCount++;
        }
        return current;
    }
}
