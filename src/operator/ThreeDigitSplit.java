package operator;

import java.util.Scanner;

/**
 * 【运算符】ThreeDigitSplit
 * 题目：输入一个三位数，分别输出它的百位、十位、个位数字。
 */
public class ThreeDigitSplit {
    public static void main(String[] args) {
        // 在这里写你的代码
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个三位数");
        int num = sc.nextInt();
        int bai = num /10/10;
        int shi = num/10%10;
        int ge = num%10;
        System.out.println("百位：" + bai);
        System.out.println("十位：" + shi);
        System.out.println("个位：" + ge);
    }
}

