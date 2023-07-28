
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MiddleWordLength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+");
        System.out.println(Arrays.toString(words));

        int middleIndex = words.length / 2;
        System.out.println(middleIndex);
        int middleLength = words[middleIndex].length();

        // If there are two middle elements, check which one has the maximum length
        if (words.length % 2 == 0) {
            int middleIndex2 = middleIndex - 1;
            int middleLength2 = words[middleIndex2].length();

            if (middleLength2 > middleLength) {
                middleLength = middleLength2;
            }
        }

        System.out.println("Length of the middle word(s): " + middleLength);

        scanner.close();
    }
}
