package loop;

import java.util.Scanner;

/**
 * 【循环结构】Factorial
 * 题目：输入一个正整数n，计算 n!（阶乘）的结果。
 */
public class Factorial {
    public static void main(String[] args) {
        // 在这里写你的代码
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int n = sc.nextInt();

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(n + "! = " + result);
        sc.close();
    }
}


