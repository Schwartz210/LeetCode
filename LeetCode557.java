package LeetCode;

class LeetCode557 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        String word;
        int j;
        for (int i=0;i<words.length;i++){
            word = words[i];
            j = word.length()-1;
            while (j >= 0){
                sb.append(word.charAt(j));
                j--;
            }
            if (i != words.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}