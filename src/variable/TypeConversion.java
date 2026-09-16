package variable;

/**
 * 【变量与数据类型】TypeConversion
 * 题目：将一个 int 型变量赋值给 long 型，再将一个 long 型变量强制转换为 int 型，观察并输出结果差异。
 */
public class TypeConversion {
    public static void main(String[] args) {
        //自动转换（隐式）：小范围 → 大范围，如 byte→short→int→long→float→double
        // 强制转换（显式）：大范围 → 小范围，用 `(类型)`，可能溢出或丢失精度
        // long 值 10000000000 超出 int 范围（-21亿~21亿），强制转换后结果错误
        // 自动转换：int → long（小范围转大范围）
        int a = 100;
        long b = a;
        System.out.println("int a = " + a + "，自动转 long b = " + b);

        // 强制转换：long → int（大范围转小范围，可能溢出）
        long c = 10000000000L;
        int d = (int) c;
        System.out.println("long c = " + c + "，强制转 int d = " + d + "（溢出了）");

        // 自动转换：int → double
        int e = 5;
        double f = e;
        System.out.println("int e = " + e + "，自动转 double f = " + f);

        // 强制转换：double → int（小数部分丢失）
        double g = 3.99;
        int h = (int) g;
        System.out.println("double g = " + g + "，强制转 int h = " + h + "（小数丢失）");
    }
}

