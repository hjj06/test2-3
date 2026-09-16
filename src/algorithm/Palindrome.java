package algorithm;

/**
 * 【算法同步练习】Palindrome
 * 题目：给定一个字符串，判断它是不是回文串（只考虑字母和数字字符，忽略大小写）。示例：输入 'A man, a plan, a canal: Panama'，输出 true
 */
public class Palindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        String str = cleaned.toString();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));  // true
        System.out.println(isPalindrome("race a car"));  // false
    }
}


