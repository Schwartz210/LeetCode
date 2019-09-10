package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1002 {
    public List<String> commonChars(String[] A) {
        ArrayList<String> results = new ArrayList<>();
        String firstWord = A[0];
        String letter;
        int index;
        boolean check;
        for (int i = 0;i<firstWord.length();i++){
            letter = String.valueOf(firstWord.charAt(i));
            check = true;
            for (int j=1;j<A.length;j++){
                index = A[j].indexOf(letter);
                if (index > -1){
                    A[j] = remove(A[j], index);
                    continue;
                } else {
                    check = false;
                    break;
                }
            }
            if (check){
                results.add(letter);
            }
        }
        return results;
    }

    private String remove(String string, int index){
        StringBuilder sb = new StringBuilder(string);
        sb.deleteCharAt(index);
        return sb.toString();
    }
}
