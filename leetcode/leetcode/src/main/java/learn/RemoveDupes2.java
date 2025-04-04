package learn;

import java.util.HashSet;

//from https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/
public class RemoveDupes2 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode temp = new ListNode();
        temp.next = head;
        ListNode previous = temp;
        ListNode current = head;

        while (current != null){
            if (current.next != null && current.val == current.next.val){
                int value = current.val;
                while(current != null && value == current.val){
                    current = current.next;
                }
                previous.next = current;
            } else {
                current = current.next;
                previous = previous.next;
            }
        }
        return temp.next;
    }
}
