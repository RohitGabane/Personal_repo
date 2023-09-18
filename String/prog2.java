//Q4. Accept a sentence from user and count number of words 

import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);

        sc.close();
    }

    public static int countWords(String sentence) {
        String[] words = sentence.split("\\s+");
        return words.length;
    }
}
