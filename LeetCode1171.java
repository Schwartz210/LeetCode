package LeetCode;

import java.util.ArrayList;

class LeetCode1171 {
    public ListNode removeZeroSumSublists(ListNode head) {
        ArrayList<Integer> array = new ArrayList<>();
        ListNode node = head;
        while (node != null){
            array.add(node.val);
            node = node.next;
        }
        int window = 1;
        int start = 0;
        while (array.size() >= window){
            if (rangeSumsToZero(array, start, start+window)){
                for (int i=0;i<window;i++){
                    array.remove(start);
                }
                window = 1;
                start = -1;
            }
            start++;
            if (start + window > array.size()){
                start = 0;
                window++;
            }
        }

        if (array.size() == 0){
            return null;
        } else if (array.size() == 1){
            return new ListNode(array.get(0));
        } else {
            ListNode result = new ListNode(array.get(0));
            ListNode temp = result;
            for (int i=1;i<array.size();i++){
                temp.next = new ListNode(array.get(i));
                temp = temp.next;

            }
            return result;
        }
    }

    private boolean rangeSumsToZero(ArrayList<Integer> array, int index1, int index2){
        int total = 0;
        for (int i=index1;i<index2;i++){
            total += array.get(i);
        }
        return total == 0;
    }
}