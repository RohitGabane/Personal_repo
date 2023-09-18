//Q4. Print binary of a number in reverse order

import java.util.Scanner;

public class logictest24
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.print("bin reverse: ");
        binrev(num);
        
    }
    public static void binrev(int num) {
        if (num > 0) {
            int remainder = num % 2;
            System.out.print(remainder);
            binrev(num / 2);
        }
    }
}

