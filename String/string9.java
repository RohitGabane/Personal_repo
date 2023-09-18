import java.util.Scanner;

public class string9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character to delete: ");
        char inputChar = scanner.next().charAt(0);

        String result = delCharacter(inputString, inputChar);
        System.out.println("String after deletion: " + result);

        scanner.close();
    }

    public static String delCharacter(String str, char character) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != character) {
                result.append(c);
            }
        }
        return result.toString();
    }
}

