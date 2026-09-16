package algorithm;

import java.util.Arrays;

/**
 * 【算法同步练习】RemoveDuplicates
 * 题目：给定一个有序整数数组，原地删除重复出现的元素，使每个元素只出现一次，返回删除后数组的新长度。示例：输入 [1,1,2]，输出长度 2，数组前两位为 [1,2]
 */
public class RemoveDuplicates {

    public static int removeElement(int[] nums, int val) {
        int slow = 0;  // 慢指针：新数组的位置
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int len = removeElement(nums, 3);
        System.out.println("新长度：" + len);  // 2
        System.out.println(Arrays.toString(Arrays.copyOf(nums, len)));  // [2, 2]
    }
}



