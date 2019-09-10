package LeetCode;


class LeetCode507 {
    public boolean checkPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        int value = num;
        for (int i=1;i<num/2+1;i++){
            if (num % i == 0){
                value -= i;
            }
        }
        return value == 0;
    }
}
