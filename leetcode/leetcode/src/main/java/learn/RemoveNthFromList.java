package learn;
//from https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
public class RemoveNthFromList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = head;

        int headCount = 0;
        while (newHead != null){
            headCount ++;
            newHead = newHead.next;
        }
        newHead = head;
        ListNode previous = null;
        for (int i = 0; i < headCount - n + 1; i++){
            if (i < headCount - n){

            } else if (i == headCount - n - 1){
                previous = newHead;
                newHead = newHead.next;
            } else if (i == headCount - n){
                previous.next = newHead.next;
            }
            newHead = newHead.next;
        }

        return newHead;
    }
}
