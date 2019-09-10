package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class LeetCode791 {
    public String customSortString(String S, String T) {
        HashSet<Character> set = new HashSet<>();
        for (char letter:S.toCharArray()){
            set.add(letter);
        }
        StringBuilder end = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char letter:T.toCharArray()){
            if (!set.contains(letter)){
                end.append(letter);
                continue;
            }
            if (map.containsKey(letter)){
                map.put(letter, map.get(letter)+1);
            } else {
                map.put(letter, 1);
            }
        }
        StringBuilder results = new StringBuilder();
        int iterations;
        for (char letter:S.toCharArray()){
            if (map.containsKey(letter)){
                iterations = map.get(letter);
                for (int i=0;i<iterations;i++){
                    results.append(letter);
                }
            }
        }
        results.append(end.toString());
        return results.toString();
    }
}