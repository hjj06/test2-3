package array;

import java.util.Scanner;

/**
 * 【数组】BubbleSort
 * 题目：输入整数n，生成长度为n的数组，元素为0~n-1的随机数，用冒泡排序对数组从小到大排序。
 */
public class BubbleSort {
    public static void main(String[] args) {
        // 在这里写你的代码
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数组长度n：");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * n);
        }

        System.out.print("排序前：");
        for (int num : arr) System.out.print(num + " ");

        // 冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;  // 优化：标记本轮是否有交换
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;  // 本轮没有交换，说明已有序
        }

        System.out.print("\n排序后：");
        for (int num : arr) System.out.print(num + " ");
        sc.close();
    }
}
