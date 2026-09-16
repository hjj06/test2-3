package algorithm;

/**
 * 【算法同步练习】SearchInsert
 * 题目：给定一个排序数组和一个目标值，在数组中找到目标值并返回其索引；目标值不存在则返回它按顺序插入的位置。示例：输入 [1,3,5,6], target=5，输出 2
 */
public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;  // 防止溢出
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;  // 没找到，left就是插入位置
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 5));  // 2（找到）
        System.out.println(searchInsert(nums, 2));  // 1（插入到1和3之间）
        System.out.println(searchInsert(nums, 7));  // 4（插入到末尾）
        System.out.println(searchInsert(nums, 0));  // 0（插入到开头）
    }
}
