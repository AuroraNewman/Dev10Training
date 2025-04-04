package learn;

public class Main {
    public static void main(String[] args) {
        Add2NumsLLists add2NumsLLists = new Add2NumsLLists();
        MergeSortedLinkedLists mergeSortedLinkedLists = new MergeSortedLinkedLists();
        RotateList rotateList = new RotateList();
        int[] list1 = {1,2,3,4,5};
        int[] list2 = {0,1,2};
        ListNode listNode1 = ListNode.generateListNodeFromArray(list1);
        ListNode listNode2 = ListNode.generateListNodeFromArray(list2);
        ListNode listNode3 = rotateList.rotateRight(listNode1, 2);
        ListNode listNode4 = rotateList.rotateRight(listNode2, 4);
        while (listNode3 !=null){
            System.out.println(listNode3.val);
            listNode3=listNode3.next;
        }
        while (listNode4 !=null){
            System.out.println(listNode4.val);
            listNode4=listNode4.next;
        }
        //should be 6801


    }
}