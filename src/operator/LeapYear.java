package operator;

import java.util.Scanner;

/**
 * 【运算符】LeapYear
 * 题目：输入一个年份，判断是否为闰年（规则：能被4整除但不能被100整除，或能被400整除）。
 */
public class LeapYear {
    public static void main(String[] args) {
        // 在这里写你的代码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println();
        }else {
            System.out.println();
        }
    }
}

