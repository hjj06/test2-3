package algorithm;

import java.util.Arrays;

/**
 * 【算法同步练习】MergeSortedArray
 * 题目：给两个按非递减顺序排列的整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使 nums1 成为有序数组。
 * 示例：nums1=[1,2,3,0,0,0], m=3；nums2=[2,5,6], n=3；输出 [1,2,2,3,5,6]
 */
public class MergeSortedArray {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            // 从后向前合并
            int p1 = m - 1;
            int p2 = n - 1;
            int p = m + n - 1;

            while (p2 >= 0) {  // 只要nums2还有元素没合并
                if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                    nums1[p] = nums1[p1];
                    p1--;
                } else {
                    nums1[p] = nums2[p2];
                    p2--;
                }
                p--;
            }
        }

        public static void main(String[] args) {
            int[] nums1 = {1, 2, 3, 0, 0, 0};
            int[] nums2 = {2, 5, 6};
            merge(nums1, 3, nums2, 3);
            System.out.println(Arrays.toString(nums1));
        }
    }