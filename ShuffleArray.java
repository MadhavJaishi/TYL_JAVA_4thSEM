import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {4,5,3,7,2,7};
        int n = 3;
        int[] arr;
        arr = shuffle(nums, n);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] shuffle(int[] nums, int n) {
        int m = nums.length;

        int startPoint = 0;
        int midPoint = n;

        int[] dummy= new int[m];

        for(int i=0; i<m; i++)
        {
            if(i%2 == 0){
                dummy[i]=nums[startPoint];
                startPoint++;
            }else{
                dummy[i]=nums[midPoint];
                midPoint++;
            }

        }

        return dummy;
    }
}
