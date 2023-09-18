import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Enter the word to be checked");
        String word = sc.nextLine();
        int index = 0;
        int lastIndex = 0;
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == word.charAt(index)) {
                flag = true;
                lastIndex = i;
                while (flag) {
                    if (input.charAt(lastIndex) == word.charAt(index)) {
                        lastIndex++;
                        index++;
                        if (index == word.length()) {
                            count++;
                            index = 0;
                            break;
                        }
                    } else {
                        flag = false;
                    }
                }

            }
        }
        System.out.println(word + " occured: " + count + " times.");
    }
}
