package variable;

import java.util.Scanner;

/**
 * 【变量与数据类型】DecimalSplit
 * 题目：输入一个 double 类型的小数，分别输出它的整数部分和小数部分。
 */
public class DecimalSplit {
    public static void main(String[] args) {
        // - 强制类型转换 `(int)double` 直接截断小数部分（不是四舍五入）
        //- 小数部分 = 原数 - 整数部分
        //- 浮点数有精度误差，用 `String.format("%.6f")` 格式化输出
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个double类型的小数");
        double num = sc.nextDouble();
        int intPart = (int) num;
        double decimalPart = num - intPart;
        System.out.println("整数部分：" + intPart);
        System.out.println("小数部分：" + String.format("%.6f", decimalPart));
    }
}

