import java.util.Scanner;

public class arrayornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        System.out.println("Enter 5 num:");

        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }

        System.out.print("search for Elements: ");
        int search = sc.nextInt();

        boolean found = false;
        for (int number : num) {
            if (number == search) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The number " + search + " is in the array.");
        } else {
            System.out.println("The number " + search + " is not in the array.");
        }
        sc.close();
    }
}
