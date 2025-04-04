package learn;

import java.util.ArrayList;
import java.util.List;

//from https://leetcode.com/problems/add-two-numbers/description/
public class Add2NumsLLists {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        while (l1 != null){
            list1.add(l1.val);
            l1=l1.next;
        }
        while (l2 != null){
            list2.add(l2.val);
            l2=l2.next;
        }
        int largerSize = Math.max(list1.size(), list2.size());
        int smallerSize = Math.min(list1.size(), list2.size());
        for (int i = largerSize - smallerSize; i > 0; i--){
            if (list1.size() < list2.size()){
                list1.add(0,0);
            } else if (list2.size() < list1.size()){
                list2.add(0,0);
            }
        }

        for (int i = largerSize; i > 0; i--){

        }

        return null;
    }
}
/*
String list1AsString = "";
        String list2AsString = "";

        while (l1 != null){
            list1AsString+=String.valueOf(l1.val);
            l1=l1.next;
        }
        while (l2 != null){
            list2AsString+=String.valueOf(l2.val);
            l2=l2.next;
        }

        long l1AsInt = Long.parseLong(reverseString(list1AsString));
        long l2AsInt = Long.parseLong(reverseString(list2AsString));
        long sum = l1AsInt + l2AsInt;
        String sumAsString = String.valueOf(sum);
        sumAsString=reverseString(sumAsString);

        char[] sumAsCharArray = sumAsString.toCharArray();
        int [] sumAsArray = new int[sumAsCharArray.length];

        for (int i = 0; i < sumAsCharArray.length; i++){
            sumAsArray[i]=Integer.parseInt(String.valueOf(sumAsCharArray[i]));
        }

        ListNode listHead = new ListNode();
        ListNode currentNode = listHead;
        for (int i = 0; i < sumAsArray.length; i++){
            currentNode.next=new ListNode(sumAsArray[i]);
            currentNode=currentNode.next;
        }

        return listHead.next;
    }
    private String reverseString(String listAsString){
        return new StringBuilder(listAsString).reverse().toString();
    }
 */
