package learn;

public class Main {
    public static void main(String[] args) {
        MajorityElement me = new MajorityElement();
        int[] list1 = {3,2,3};
        int[] list2 = {2,2,1,1,1,2,2};
        int[] list3 = {1,1,1,2,2,2,2};

        System.out.println(me.majorityElement(list1));
        System.out.println(me.majorityElement(list2));
        System.out.println(me.majorityElement(list3));
    }
}