package string;

import java.util.Scanner;

/**
 * 【字符串】CharOccurrence
 * 题目：输入一个字符串和一个字符，统计该字符在字符串中出现的次数。
 */
public class CharOccurrence {
    public static void main(String[] args) {
        // 在这里写你的代码
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String s = sc.nextLine();
        System.out.print("请输入要统计的字符：");
        char target = sc.next().charAt(0);
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target){
                count++;
            }
        }
        System.out.println("字符 '" + target + "' 在字符串中出现了 " + count + " 次");
    }
}

