package learn;
//from https://leetcode.com/problems/merge-two-sorted-lists/description/
public class MergeSortedLinkedLists {

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode listHead = new ListNode();
            ListNode currentNode = listHead;

            while (list1 != null && list2 != null){
                if (list1.val < list2.val){
                    currentNode.next=list1;
                    list1=list1.next;
                } else {
                    currentNode.next=list2;
                    list2=list2.next;
                }
                currentNode = currentNode.next;
            }

            if (list1 == null){
                currentNode.next = list2;
            } else {
                currentNode.next = list1;
            }

            return listHead.next;
        }
    }

