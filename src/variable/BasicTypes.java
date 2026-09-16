package variable;

/**
 * 【变量与数据类型】BasicTypes
 * 题目：定义Java 8种基本数据类型的变量各一个，分别赋值并打印输出它们的值和类型名。
 */
public class BasicTypes {
    public static void main(String[] args) {
        // 在这里写你的代码
        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 10000L;
        float f = 3.14f;
        double d = 3.14159;
        char c = 'A';
        boolean bool = true;

        System.out.println("byte: " + b + "，类型：" + ((Object)b).getClass().getSimpleName());
        System.out.println("short: " + s + "，类型：" + ((Object)s).getClass().getSimpleName());
        System.out.println("int: " + i + "，类型：" + ((Object)i).getClass().getSimpleName());
        System.out.println("long: " + l + "，类型：" + ((Object)l).getClass().getSimpleName());
        System.out.println("float: " + f + "，类型：" + ((Object)f).getClass().getSimpleName());
        System.out.println("double: " + d + "，类型：" + ((Object)d).getClass().getSimpleName());
        System.out.println("char: " + c + "，类型：" + ((Object)c).getClass().getSimpleName());
        System.out.println("boolean: " + bool + "，类型：" + ((Object)bool).getClass().getSimpleName());
    }
}

