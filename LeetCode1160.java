package LeetCode;

import java.util.HashMap;

class LeetCode1160 {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> frequency;
        boolean match;
        int result = 0;
        for (String word:words){
            frequency = getFrequency(chars);
            match = true;
            for (char letter:word.toCharArray()){
                if (!frequency.containsKey(letter)){
                    match = false;
                    break;
                } else {
                    frequency.put(letter, frequency.get(letter)-1);
                    if (frequency.get(letter) == 0){
                        frequency.remove(letter);
                    }
                }
            }
            if (match){
                result += word.length();
            }
        }
        return result;
    }

    private HashMap<Character, Integer> getFrequency(String chars){
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (char letter:chars.toCharArray()){
            if (!frequency.containsKey(letter)){
                frequency.put(letter, 1);
            } else {
                frequency.put(letter, frequency.get(letter)+1);
            }
        }
        return frequency;
    }
}
