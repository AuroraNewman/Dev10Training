package learn;

public class Main {
    public static void main(String[] args) {
        HouseRobber houseRobber = new HouseRobber();
        int[] nums = {1,2,3,1};
        System.out.println(houseRobber.rob(nums));
        nums = new int[]{2, 7, 9, 3, 1};
        System.out.println(houseRobber.rob(nums));
        nums = new int[]{1};
        System.out.println(houseRobber.rob(nums));
        nums = new int[]{1, 1, 3, 50, 5};
        System.out.println(houseRobber.rob(nums));
    }
}