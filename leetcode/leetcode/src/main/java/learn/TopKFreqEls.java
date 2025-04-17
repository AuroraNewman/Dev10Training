package learn;

import java.util.HashMap;

/*
number 347
https://leetcode.com/problems/top-k-frequent-elements/
 */
public class TopKFreqEls {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> values = new HashMap<>();
        int[] result = new int[k];
        for (Integer number : nums){
            if (values.containsKey(number)){
                values.put(number, values.get(number) + 1);
            } else {
                values.put(number, 1);
            }
        }




        return null;
    }
}
