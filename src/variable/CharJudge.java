package variable;

import java.util.Scanner;

/**
 * 【变量与数据类型】CharJudge
 * 题目：输入一个字符，判断它是大写字母、小写字母、数字还是其他符号。
 */
public class CharJudge {
    public static void main(String[] args) {
        // - char 本质是整数（Unicode 编码），可以直接用 `>=` `<=` 比较
        //- 大写 A-Z 编码 65-90，小写 a-z 97-122，数字 0-9 48-57
        //- Scanner 没有直接读 char 的方法，用 `next().charAt(0)` 取第一个字符
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符");
        char c = sc.next().charAt(0);
        if (c >= 'A' && c <= 'Z'){
            System.out.println(c+"是大写字母");
        }else if (c >= 'a' && c <='z'){
            System.out.println(c+"是小写字母");
        } else if (c >= '0' && c <= '9') {
            System.out.println(c + " 是数字");
        } else {
            System.out.println(c + " 是其他符号");
        }
    }
}

