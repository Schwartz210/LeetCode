package LeetCode;

import java.util.ArrayList;

class LeetCode234 {
    public boolean isPalindrome(ListNode head) {
        boolean result = true;
        ArrayList<Integer> values = new ArrayList<>();
        ListNode node = head;
        while (node != null){
            values.add(node.val);
            node = node.next;
        }
        int i = 0;
        int j = values.size()-1;

        while (j > i){
            if (!values.get(i).equals(values.get(j))){
                result = false;
                break;
            }
            i++;
            j--;
        }
        return result;
    }
}