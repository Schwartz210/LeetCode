package LeetCode;

class LeetCode434 {
    public int countSegments(String s) {
        boolean block = false;
        int count = 0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == ' '){
                block = false;
            } else if (s.charAt(i) != ' ' && !block){
                count++;
                block = true;
            }
        }
        return count;
    }
}