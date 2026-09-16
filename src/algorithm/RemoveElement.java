package algorithm;

import java.util.Arrays;

/**
 * 【算法同步练习】RemoveElement
 * 题目：给定一个数组和一个值 val，原地移除所有数值等于 val 的元素，返回移除后数组的新长度。示例：输入 [3,2,2,3], val=3，输出长度 2，数组前两位为 [2,2]
 */
public class RemoveElement {
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
                System.out.println(Arrays.toString(Arrays.copyOf(nums, len)));
            }
    }


