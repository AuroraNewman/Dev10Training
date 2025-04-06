package learn;

import java.util.HashMap;

//from https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150
public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int maxHeadCount = 0;
        int majorityElement = 0;
        for (Integer i : nums){
            Integer headCount = 1;
            if (count.containsKey(i)){
                headCount = count.get(i) +1;
                count.put(i, headCount);
            } else {
                count.put(i, headCount);
            }
            if (headCount > maxHeadCount){
                maxHeadCount = headCount;
                majorityElement = i;
            }
            if (maxHeadCount > nums.length / 2){
                return majorityElement;
            }
        }
        return majorityElement;
    }
}
