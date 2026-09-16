package condition;

import java.util.Scanner;

/**
 * 【条件判断】TriangleJudge
 * 题目：输入三个边长数值，判断能否构成三角形；若能，进一步判断是等边、等腰还是普通三角形。
 */
public class TriangleJudge {
    public static void main(String[] args) {
        // - 三角形条件：任意两边之和 > 第三边（严格大于，等于时三点共线）
        //- 判断顺序：先判断不能构成，再判断等边（三边都相等），再判断等腰（任意两边相等），最后普通
        //- 等边是特殊的等腰，必须先判断等边，否则会被当成等腰
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入三个边长：");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a + b <= c || a + c <= b || b+c<=a){
            System.out.println("不能构成三角形");
        } else if (a==b && b==c) {
            System.out.println("构成等边三角形");
        } else if (a == b || a == c || b == c) {
            System.out.println("等腰三角形");
        } else {
            System.out.println("普通三角形");
        }
    }
}

