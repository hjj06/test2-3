package array;

/**
 * 【数组】ArrayTraverse
 * 题目：创建一个长度为10的int数组，存入1~10，遍历数组并打印所有元素。
 */
public class ArrayTraverse {
    public static void main(String[] args) {
        // 在这里写你的代码
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        for (int num : arr) {
            System.out.println(num);
        }
    }
}

