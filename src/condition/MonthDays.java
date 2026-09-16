package condition;

import java.util.Scanner;

/**
 * 【条件判断】MonthDays
 * 题目：输入一个月份，输出该月份对应的天数（2月默认28天，不考虑闰年）。
 */
public class MonthDays {
    public static void main(String[] args) {
        // 在这里写你的代码
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个月份");
        int month = sc.nextInt();
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println(month +"月有31天");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println(month+"月有30天");
                break;
            case 2:
                System.out.println(month+"月有28天");
                break;
        }
    }
}

