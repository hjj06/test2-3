package loop;

/**
 * 【循环结构】OddSum
 * 题目：输出1~100之间所有奇数，并计算它们的总和。
 */
public class OddSum {
    public static void main(String[] args) {
        // 在这里写你的代码
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {  // 判断是奇数
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println();
        System.out.println("1~100奇数的总和为：" + sum);
    }
}

