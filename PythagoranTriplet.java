import java.util.Scanner;

public class PythagoranTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();


        boolean ans = isPythagoranTriplet(num1,num2,num3);
        System.out.println(ans);
    }
    public static boolean isPythagoranTriplet(int n1, int n2, int n3) {
        int sum;
        n3 *=n3;
        sum = (n1*n1) + (n2*n2);
        return (n3==sum);
    }
}
