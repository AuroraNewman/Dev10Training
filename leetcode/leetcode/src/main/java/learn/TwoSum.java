package learn;

import java.util.HashMap;

//from https://leetcode.com/problems/two-sum/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (i == j){

                } else {
                    if (nums[i] + nums[j] == target){
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
        }
        return result;
    }
    public int[] twoSumMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++){
            int val = target - nums[i];
            if (map.containsKey(val) && map.get(val) != i){
                return new int[] {i, map.get(val)};
            }
        }
        return new int[] {};
    }
}
