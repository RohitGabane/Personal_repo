import java.util.Scanner;

public class uniqueArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept 5 numbers in an array
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Create an array to store unique elements
        int[] uniqueArray = new int[5];
        int uniqueCount = 0;

        // Iterate through the input array
        for (int i = 0; i < numbers.length; i++) {
            boolean isUnique = true;

            // Check if the number is already in the unique array
            for (int j = 0; j < uniqueCount; j++) {
                if (numbers[i] == uniqueArray[j]) {
                    isUnique = false;
                    break;
                }
            }

            // If the number is unique, add it to the unique array
            if (isUnique) {
                uniqueArray[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

        // Print the unique array
        System.out.println("Unique array:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }
}
