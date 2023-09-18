//Q1. Accept string from user , accept a character from user and count the occurrence of the same 
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character: ");
        char targetChar = scanner.next().charAt(0);

        int count = countOccurrences(inputString, targetChar);
        System.out.println("The character '" + targetChar + "' appears " + count + " times in the string.");

        scanner.close();
    }

    public static int countOccurrences(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}
