package method;

/**
 * 【方法】IsPrimeMethod
 * 题目：封装一个方法，判断一个整数是否是素数，返回boolean类型；调用该方法输出100以内的所有素数。
 */
public class IsPrimeMethod {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("2~100的素数：");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

