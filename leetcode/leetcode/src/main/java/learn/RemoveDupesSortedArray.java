package learn;

import java.util.HashSet;

/*
problem 26
https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150
 */
public class RemoveDupesSortedArray {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> vals = new HashSet<>();
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            if (vals.add(nums[i])){
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        RemoveDupesSortedArray rdsa = new RemoveDupesSortedArray();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(rdsa.removeDuplicates(nums));
    }
}
