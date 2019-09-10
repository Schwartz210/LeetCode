package LeetCode;

import java.util.*;

class LeetCode1154 {
    public int dayOfYear(String date) {
        String[] array = date.split("-");
        int total = Integer.valueOf(array[2]);
        int monthsCompleted = Integer.valueOf(array[1])-1;
        int daysInMonth = getCountofDaysFromMonth(monthsCompleted);
        if (monthsCompleted >= 2 && isLeapYear(array[0])){
            daysInMonth += 1;
        }
        total += daysInMonth;
        return total;
    }

    private int getCountofDaysFromMonth(int month){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 31);
        map.put(2, 28);
        map.put(3, 31);
        map.put(4, 30);
        map.put(5, 31);
        map.put(6, 30);
        map.put(7, 31);
        map.put(8, 31);
        map.put(9, 30);
        map.put(10, 31);
        map.put(11, 30);
        map.put(12, 31);
        int total = 0;
        for (int i=0;i<=month;i++){
            total += map.get(i);
        }
        return total;
    }

    private boolean isLeapYear(String year){
        int yearint = Integer.valueOf(year);
        if (yearint % 4 == 0){
            if (yearint % 100 == 0){
                if (yearint % 400 == 0){
                    return true;
                } else {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}