package learn;

public class Main {
    public static void main(String[] args) {
        LinkedListCycle llc = new LinkedListCycle();
        int[] nodes = {3,2,0,-4,2,0};
        ListNode head = ListNode.generateListNodeFromArray(nodes);
        System.out.println(llc.hasCycle(head));
    }
}