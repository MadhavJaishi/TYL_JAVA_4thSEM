public class RemoveDuplicatedFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4};
        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }
    public static int removeDuplicates(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            int c = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (ans[j] == nums[i]) {
                    c = -1;
                }
            }
            if (c == 0) {
                ans[k] = nums[i];
                k++;
            }
        }
        return ans.length;
    }
}
