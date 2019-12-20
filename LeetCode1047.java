package LeetCode;

class LeetCode1047 {
    public String removeDuplicates(String S) {
        int index = containsDupAtIndex(S);
        while (index >= 0){
            S = remove(S, index);
            index = containsDupAtIndex(S);
        }
        return S;
    }

    private int containsDupAtIndex(String S){
        for (int i=0;i<S.length()-1;i++){
            if (S.charAt(i) == S.charAt(i+1)){
                return i;
            }
        }
        return -1;
    }

    private String remove(String S, int index){
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<S.length();i++){
            if (i != index && i != index+1){
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }
}
