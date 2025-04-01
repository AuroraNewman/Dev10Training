package learn;


// from https://leetcode.com/problems/rotate-array/
public class RotateArray {
    public void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }
        k = k % nums.length;

        int[] result = new int[nums.length];

        int i = nums.length - k;
        int index = 0;

        while (i < nums.length){
            result[index] = nums[i];
            i++;
            index++;
        }

        for (int j = 0; j < nums.length - k; j++){
            result[index] = nums[j];
            index++;
        }

        System.out.println("nums");
        for (int num : nums){
            System.out.print(num + " ");
        }

        System.out.println("result");
        for (int num : result){
            System.out.print(num + " ");
        }
        for (int l = 0; l < nums.length; l++){
            nums[l] = result[l];
        }


    }
}