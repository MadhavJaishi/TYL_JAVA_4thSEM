public class EuclideanGCDorHCF {
    public static void main(String[] args) {
        int a = 20;
        int b = 175;
        int ans = gcd(a, b);
        System.out.println(ans);
        int ans2 = lcm(a, b);
        System.out.println(ans2);
    }

    //Recursion
    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b%a, a);
    }
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

//    static int gcd(int a, int b) {
//        int temp;
//        while(b % a != 0) {
//            temp = a;
//            a = b % a;
//            b = temp;
//        }
//        return a;
//    }
}
