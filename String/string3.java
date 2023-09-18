//Accept a string and reverse it

import java.util.Scanner;

public class string3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

    public static String reverseString(String str) {
        char[] characters = str.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            // Swap characters at left and right positions
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            // Move the pointers towards each other
            left++;
            right--;
        }

        return new String(characters);
    }
}
