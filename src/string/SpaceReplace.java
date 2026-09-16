package string;

import java.util.Scanner;

/**
 * 【字符串】SpaceReplace
 * 题目：输入一个字符串，将字符串中所有空格替换为下划线后输出。
 */
public class SpaceReplace {
    public static void main(String[] args) {
        // 在这里写你的代码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.nextLine();
        String result1 = s.replace(" ","—");
        System.out.println("方法一结果：" + result1);

        // 方法二：手动实现，用StringBuilder拼接
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append("_");
            } else {
                sb.append(c);
            }
        }
        System.out.println("方法二结果：" + sb.toString());
        sc.close();
    }
}

