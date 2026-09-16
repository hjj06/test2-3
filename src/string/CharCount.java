package string;

import java.util.Scanner;

/**
 * 【字符串】CharCount
 * 题目：输入一个字符串，统计其中大写字母、小写字母、数字的个数。
 */
public class CharCount {
    public static void main(String[] args) {
        // 在这里写你的代码
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String s = sc.nextLine();
        int upper = 0, lower = 0, digit = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                upper++;
            }
            else if (c >= 'a' && c <= 'z'){
                lower++;
            }
            else if (c >= '0' && c <= '9'){
                digit++;
            }
        }
        System.out.println("大写字母：" + upper + "个");
        System.out.println("小写字母：" + lower + "个");
        System.out.println("数字：" + digit + "个");
    }
}

