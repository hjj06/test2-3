package loop;

/**
 * 【循环结构】PrimeInRange
 * 题目：输出100~200之间的所有素数（质数）。
 */
public class PrimeInRange {
    public static void main(String[] args) {
        int count = 0;
        for (int n = 100; n <= 200; n++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;  // 找到因数就不是素数，提前结束
                }
            }
            if (isPrime && n > 1) {
                System.out.print(n + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("100~200共有 " + count + " 个素数");
    }
}

