package learn;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public static ListNode generateListNodeFromArray(int[] nums){
        if (nums.length == 0){
            return null;
        } else if (nums.length == 1){
            return new ListNode(nums[0]);
        }
        ListNode listHead = new ListNode();
        ListNode currentNode = new ListNode();
        for (int i = 0; i < nums.length; i++){
            currentNode.val=nums[i];
            if (i < nums.length - 1){
                ListNode next = new ListNode(nums[i+1]);
                if (i == 0){
                    listHead = currentNode;
                }
                currentNode.next=next;
                currentNode=currentNode.next;
            } else {
                currentNode.next=null;
            }

        }
        return listHead;
    }
}