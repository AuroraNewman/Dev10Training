package learn;
/*
problem 70
https://leetcode.com/problems/climbing-stairs/description/
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0 || n == 1){
            return 1;
        }

        int[] vals = new int[n + 1];
        vals[0] = 1;
        vals[1] = 1;

        for (int i = 2; i < vals.length; i++){
            vals[i] = vals[i - 2] + vals[i - 1];
        }

        return vals[n];
    }

    public static void main(String[] args) {
        System.out.println(new ClimbingStairs().climbStairs(2));
        System.out.println(new ClimbingStairs().climbStairs(3));
        System.out.println(new ClimbingStairs().climbStairs(45));
    }
}
