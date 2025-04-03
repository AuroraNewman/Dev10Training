package learn;
//from https://leetcode.com/problems/merge-two-sorted-lists/description/
public class MergeSortedLinkedLists {


        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

         if (list1 == null){
             return list2;
         } else if (list2 == null){
             return list1;
         }
         ListNode resultHead = new ListNode();
            ListNode result = new ListNode();
            if (list1.val < list2.val) {
                result = list1;
                resultHead = list1;
                list1 = list1.next;
            } else {
                result = list2;
                resultHead = list2;
                list2 = list2.next;
            }
         while (list1 != null && list2 != null) {
             if (list1.val < list2.val) {
                 result.next = list1;
                 list1 = list1.next;
             } else {
                 result.next = list2;
                 list2 = list2.next;
             }
             result = result.next;
         }
         if (list1 == null && list2 != null){
             result.next = list2;
         } else if (list2 == null && list1 != null){
             result.next = list1;
         }

            return resultHead;
        }
    }

