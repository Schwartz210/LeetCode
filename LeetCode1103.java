package LeetCode;

class LeetCode1103 {
    public int[] distributeCandies(int candies, int num_people) {
        int[] array = new int[num_people];
        int giftSize = 1;
        while (candies > 0){
            for (int index=0;index<num_people;index++){
                if (candies <= 0){
                    break;
                }
                if (candies >= giftSize){
                    array[index] += giftSize;
                } else {
                    array[index] += candies;
                }
                candies -= giftSize;
                giftSize++;
            }
        }
        return array;
    }
}
