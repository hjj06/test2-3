package algorithm;

/**
 * 【算法同步练习】ReverseString
 * 题目：编写函数反转输入的字符数组，必须原地修改，只使用 O(1) 额外空间。示例：输入 [h,e,l,l,o]，输出 [o,l,l,e,h]
 */
public class ReverseString {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.print("反转前：");
        System.out.println(s);
        reverseString(s);
        System.out.print("反转后：");
        System.out.println(s);  // 输出 olleh
    }
}


