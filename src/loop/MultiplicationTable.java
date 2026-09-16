package loop;

/**
 * 【循环结构】MultiplicationTable
 * 题目：打印九九乘法表。
 */
public class                                                                                                                                                                                                                                                                                                                                        MultiplicationTable {
    public static void main(String[] args) {
        // 在这里写你的代码
        for (int i = 1; i <= 9; i++) {        // 外层：行数（被乘数）
            for (int j = 1; j <= i; j++) {    // 内层：每行的式子个数（乘数）
                System.out.print(j + "×" + i + "=" + (j * i) + "\t");
            }
            System.out.println();  // 每行结束换行
        }
    }
}

