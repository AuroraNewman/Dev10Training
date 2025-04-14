package learn;
/*
problem 88
https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0){
            return;
        }

        int mIndex = m - 1;
        int nIndex = n - 1;

        for (int i = nums1.length - 1; i >= 0; i--){
            if (mIndex < 0){
                nums1[i] = nums2[nIndex];
                nIndex--;
            } else if (nIndex < 0){
                nums1[i]=nums1[mIndex];
                mIndex--;
            } else if (nums1[mIndex] > nums2[nIndex]){
                nums1[i] = nums1[mIndex];
                nums1[mIndex] = 0;
                mIndex--;
            } else {
                nums1[i] = nums2[nIndex];
                nums2[nIndex] = 0;
                nIndex--;
            }
        }
        for (int num : nums1){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        MergeSortedArray msa = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        msa.merge(nums1, m, nums2, n);
    }
}
