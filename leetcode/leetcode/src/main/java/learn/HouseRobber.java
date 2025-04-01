package learn;

public class HouseRobber {
//    https://leetcode.com/problems/house-robber/?envType=study-plan-v2&envId=top-interview-150
public int rob(int[] nums) {
//    todo: fails [2,1,1,2] because it returns 3 when robber could hit first and last homes for 4
    if (nums.length <= 1){
        return nums[0];
    }
    int zeroStartSum = 0;
    int oneStartSum = 0;

//    int zIndex = 0;
//    while (zIndex < nums.length){
//        zeroStartSum+=nums[zIndex];
//        zIndex+=2;
//    }
//
//    int oIndex = 1;
//    while (oIndex < nums.length){
//        oneStartSum+=nums[oIndex];
//        oIndex+=2;
//    }

    for (int i = 0; i < nums.length; i++){
        if (i%2 == 0){
            zeroStartSum+=nums[i];
        } else {
            oneStartSum+=nums[i];
        }
    }


    return Math.max(zeroStartSum, oneStartSum);
    }
}
