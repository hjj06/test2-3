package operator;

import java.util.Scanner;

/**
 * 【运算符】MaxOfThree
 * 题目：使用三元运算符：输入三个整数，输出其中最大的数。
 */
public class MaxOfThree {
    static void main(String[] args) {
        // 在这里写你的代码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数");
        int c = sc.nextInt();
        int temp = a > b ? a:b;
        int max = temp > c ? temp:c;
        System.out.println(max);
    }
}

