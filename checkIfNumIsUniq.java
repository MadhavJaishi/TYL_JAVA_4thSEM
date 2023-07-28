public class checkIfNumIsUniq {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int num = 865;
        boolean a = checkUniq(num, arr);
        System.out.println(a);
    }

    static boolean checkUniq(int num, int[] arr) {
        int i = 0, flag = 0;
        while (num > 0) {
            int rem = num % 10;
            arr[i] = rem;
            for (int j = 0; j < i; j++) {
                if (arr[j] == rem) {
                    flag = 1;
                }
            }
            i++;
            num /= 10;
        }
        return flag != 1;
    }
}
