package learn;
//from https://leetcode.com/problems/rotate-list/description/
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null){
            return head;
        }

        int headCount = 0;

        ListNode tempHead = head;
        while (tempHead != null){
            headCount++;
            tempHead=tempHead.next;
        }

        k = k % headCount;
        if (k == 0){
            return head;
        }

        for (int i = 0; i < k; i++){
            ListNode tail = head;
            ListNode previous = null;

            while (tail.next != null){
                previous = tail;
                tail = tail.next;
            }
            tail.next= head;
            previous.next = null;
            head = tail;
        }

        return head;
    }
}
