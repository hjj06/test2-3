package array;

/**
 * 【数组】ArrayReverse
 * 题目：原地反转一个数组，例如原数组{1,2,3,4,5}，反转后为{5,4,3,2,1}，不使用新数组。
 */
public class ArrayReverse {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        for (int i = 0,j = arr.length-1;i<j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // 改成一行打印，格式 {5,4,3,2,1}
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length -1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("}");
    }
}