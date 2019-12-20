package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

class LeetCode299 {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        HashMap<Character, Integer> secretCharFreq = new HashMap<>();
        ArrayList<Character> leftoverGuesses = new ArrayList<>();
        for (int i=0;i<guess.length();i++){
            if (secret.charAt(i) == guess.charAt(i)){
                bulls++;
            } else {
                if (!secretCharFreq.containsKey(secret.charAt(i))){
                    secretCharFreq.put(secret.charAt(i), 1);
                } else {
                    secretCharFreq.put(secret.charAt(i), secretCharFreq.get(secret.charAt(i))+1);
                }
                leftoverGuesses.add(guess.charAt(i));
            }
        }
        int cows = 0;
        int value;
        for (int i=0;i<leftoverGuesses.size();i++){
            if (secretCharFreq.containsKey(leftoverGuesses.get(i))){
                value = secretCharFreq.get(leftoverGuesses.get(i));
                if (value > 0){
                    cows++;
                    secretCharFreq.put(leftoverGuesses.get(i), secretCharFreq.get(leftoverGuesses.get(i))-1);
                }
            }
        }
        return bulls + "A" + cows + "B";
    }
}
