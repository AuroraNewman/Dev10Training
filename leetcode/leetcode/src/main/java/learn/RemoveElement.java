package learn;

import java.util.ArrayList;

/*
problem 27
https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int notVal = 0;
        if (nums.length == 0){
            return notVal;
        }
        ArrayList<Integer> listInts = new ArrayList<>();

        for (int number : nums){
            if (number != val){
                listInts.add(number);
                notVal++;
            }
        }
        for (int i = 0; i < notVal; i++){
            nums[i] = listInts.get(i);
        }

        return notVal;
    }
}
