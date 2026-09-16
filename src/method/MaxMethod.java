package method;

/**
 * 【方法】MaxMethod
 * 题目：封装一个方法，接收两个整数参数，返回它们的最大值，在main方法中调用并测试。
 */
public class MaxMethod {
    public static void main(String[] args) {
        // 在这里写你的代码
        System.out.println("max(5, 9) = " + max(5, 9));
        System.out.println("max(5, 9,7) = " + max(5, 9,7));

    }
    public static int max (int a,int b){
        return a>b?a:b;
    }
    public  static  int max (int a,int b,int c){
        return max (max(a,b),c);
    }
}

