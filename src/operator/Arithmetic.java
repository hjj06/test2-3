package operator;

import java.util.Scanner;

/**
 * 【运算符】Arithmetic
 * 题目：输入两个整数，计算并输出它们的和、差、积、商（保留两位小数）、取余结果。
 */
public class Arithmetic {
    public static void main(String[] args) {
        // 在这里写你的代码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a = sc.nextInt();
        System.out.println("请输入第一个整数");
        int b = sc.nextInt();
        System.out.println("和"+(a+b));
        System.out.println("差"+(a-b));
        System.out.println("积"+(a*b));
        System.out.println("商"+String.format("%.2f", (double) a / b));
        System.out.println("余"+(a%b));
    }
}

