package algorithm;

/**
 * 【算法同步练习】ArraySum
 * 题目：给定一个整数数组 nums，返回数组中所有元素的和。示例：输入 [1,2,3,4]，输出 10
 */
public class ArraySum {
    public static void main(String[] args) {
        // 在这里写你的代码
        int [] arr = {1,2,3,4};
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i];
        }
        System.out.println(sum);
    }
}

