package LeetCode;

import java.util.HashSet;

class LeetCode824 {
    public String toGoatLatin(String S) {
        HashSet<Character> vowels = getVowels();
        StringBuilder results = new StringBuilder();
        String temp = "";
        char letter;
        int wordCount = 0;
        boolean wordStart = true;
        for (int i=0;i<S.length();i++){
            letter = S.charAt(i);
            if (wordStart && vowels.contains(letter)){
                temp = "ma";
                results.append(letter);
                wordStart = false;
            } else if (wordStart && !vowels.contains(letter)){
                temp = letter + "ma";
                wordStart = false;
            } else if (letter == ' '){
                wordCount++;
                for (int j=0;j<wordCount;j++){
                    temp += 'a';
                }
                results.append(temp);
                results.append(" ");
                temp = "";
                wordStart = true;
            } else {
                results.append(letter);
            }
        }
        wordCount++;
        for (int j=0;j<wordCount;j++){
            temp += 'a';
        }
        results.append(temp);
        return results.toString();
    }

    private HashSet<Character> getVowels(){
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        return vowels;
    }
}