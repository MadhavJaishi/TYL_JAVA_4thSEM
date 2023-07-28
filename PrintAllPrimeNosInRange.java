import java.util.Scanner;
public class PrintAllPrimeNosInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = sc.nextInt();
        int lastNum = sc.nextInt();

        while(firstNum<=lastNum) {
            if(isPrime(firstNum)) {
                System.out.print(firstNum + " ");
            }
            firstNum++;
        }
    }
    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        int c = 2;
        while (c*c <= num) {
            if (num%c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
