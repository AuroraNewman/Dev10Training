package learn;

import java.util.HashSet;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> nodes = new HashSet<>();
        while (head != null){
            if (nodes.add(head)){
                head = head.next;
            } else {
                return true;
            }
        }
        return false;
    }
}
