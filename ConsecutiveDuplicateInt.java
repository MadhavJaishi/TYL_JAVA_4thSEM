import java.util.Arrays;

public class ConsecutiveDuplicateInt {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 3, 5};
        int[] arr1 = new int[arr.length];
        arr1[0] = arr[0];
        int m = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr1[m] = arr[i];
                m++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}