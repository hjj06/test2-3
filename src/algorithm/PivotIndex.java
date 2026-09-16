package algorithm;

/**
 * 【算法同步练习】PivotIndex
 * 题目：给定一个整数数组，找到一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和；不存在则返回-1。示例：输入 [1,7,3,6,5,6]，输出 3
 */
public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) total += num;  // 先算总和

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            // 右侧和 = 总和 - 左侧和 - 当前元素
            int rightSum = total - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        System.out.println(pivotIndex(new int[]{1, 2, 3}));
        System.out.println(pivotIndex(new int[]{2, 1, -1}));
    }
}

