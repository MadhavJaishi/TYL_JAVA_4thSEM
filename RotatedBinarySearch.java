class RotatedBinarySeach {
    public static void main(String[] args) {
        int[] arr = {4};
        int Index = search(arr, 2);
        System.out.println(Index);
    }
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            return binarySearch(nums, 0, nums.length - 1, target);
        }
        if (target == nums[pivot]) {
            return pivot;
        }
        else if (target < nums[0]) {
            return binarySearch(nums, pivot + 1, nums.length - 1, target);
        }
        else {
            return binarySearch(nums, 0, pivot - 1, target);
        }
    }
    public static int findPivot(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            //4 cases
            int mid = (i + j) / 2;
            if (mid < j && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > i && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[i]) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] nums, int s, int e,int target) {
        while (s <= e) {
            int mid = (s + e) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}
