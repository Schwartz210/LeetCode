package LeetCode;

class LeetCode5 {
    public String longestPalindrome(String s) {
        if (s.equals("")){
            return "";
        }
        if (s.length() == 1){
            return s;
        }
        char[] array = new char[s.length()];
        fillArray(s, array);
        int left = 0;
        int window = s.length()-1;
        int index1 = -1;
        int index2 = -1;
        while (window > 0){
            if (left+window == array.length){
                window--;
                left = 0;
            }
            if (isPaladrome(array, left, left+window)){
                index1 = left;
                index2 = left+window;
                window = 0;
            } else {
                left++;
            }
        }
        return s.substring(index1, index2+1);
    }

    private void fillArray(String s, char[] array){
        for (int i=0;i<s.length();i++){
            array[i] = s.charAt(i);
        }
    }

    private boolean isPaladrome(char[] array, int index1, int index2){
        boolean result = true;
        while (index1 < index2){
            if (array[index1] != array[index2]){
                result = false;
                break;
            }
            index1++;
            index2--;
        }
        return result;
    }
}