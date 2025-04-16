package learn;

import java.util.Arrays;
import java.util.HashSet;

/*
#128
https://leetcode.com/problems/longest-consecutive-sequence/
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int number : nums){
            set.add(number);
        }
        int currentStreak = 1;
        int maxStreak = 1;
        for (int num : set){
            int number = num;
            currentStreak = 1;
            boolean streak;
            if (!set.contains(number - 1)) {
                streak = true;
                while (streak) {
                    if (set.contains(number + 1)){
                        currentStreak++;
                        number = number + 1;
                        if (currentStreak > maxStreak){
                            maxStreak = currentStreak;
                        }
                    } else {
                        streak = false;
                    }
                }
            }
        }
        return maxStreak;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
        System.out.println(lcs.longestConsecutive(new int[] {100,4,200,1,3,2}));
        System.out.println(lcs.longestConsecutive(new int[] {0,3,7,2,5,8,4,6,0,1}));
        System.out.println(lcs.longestConsecutive(new int[] {1,0,1,2}));
    }
}
