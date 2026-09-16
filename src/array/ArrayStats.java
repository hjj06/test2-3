package array;

import java.util.Scanner;

/**
 * 【数组】ArrayStats
 * 题目：输入5个整数存入数组，计算数组的总和、平均值、最大值、最小值并输出。
 */
public class ArrayStats {
    public static void main(String[] args) {
        // 在这里写你的代码
        int [] arr = new  int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入五个整数");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int sum =0;
        double avg =0;
        int max =arr[0];
        int min =arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (max<arr[i]){
                max = arr[i];
            }if (min>arr[i]){
                min=arr[i];
            }
        }
        avg = (double) sum/ arr.length;
        System.out.println("总和：" + sum);
        System.out.println("平均值：" + avg);
        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
    }
}

