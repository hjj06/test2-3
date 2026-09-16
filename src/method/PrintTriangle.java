package method;

import com.sun.jdi.PathSearchingVirtualMachine;

/**
 * 【方法】PrintTriangle
 * 题目：封装一个方法，接收一个整数n，打印n行的直角三角形（用*号），传入不同数值测试。
 */
public class PrintTriangle {
    public static void main(String[] args) {
        System.out.println("3行三角形：");
        printTriangle(3);
        System.out.println("5行三角形：");
        printTriangle(5);
        System.out.println("7行三角形：");
        printTriangle(7);
    }

    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

