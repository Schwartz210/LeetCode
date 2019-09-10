package LeetCode;

import java.util.ArrayList;

class LeetCode203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null){
            return head;
        }
        ArrayList<Integer> values = new ArrayList<>();
        ListNode read = head;
        while (read != null){
            if (read.val != val){
                values.add(read.val);
            }
            read = read.next;
        }
        if (values.size() == 0){
            return null;
        }
        ListNode result = new ListNode(0);
        ListNode temp = result;
        for (int i=0;i<values.size();i++){
            temp.val = values.get(i);
            if (i != values.size()-1){
                temp.next = new ListNode(0);
            }
            temp = temp.next;
        }
        return result;
    }
}