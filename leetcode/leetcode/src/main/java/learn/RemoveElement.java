package learn;

import java.util.ArrayList;

/*
problem 27
https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0){
            return 0;
        }
        ArrayList<Integer> numsList = new ArrayList<>();
        int notVal = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                notVal++;
            } else {
                numsList.add(nums[i]);
            }
        }
        for (int i = 0; i < numsList.size(); i++){
            nums[i] = numsList.get(i);
        }
        return notVal;
    }
}
