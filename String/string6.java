//Q6. Accept two string and check both are same or not 

import java.util.Scanner;

public class string6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1=sc.nextLine();
        System.out.println("Enter the Second string: ");
        String str2=sc.nextLine();
sc.close();
        if(str1!=str2)
        {
            System.out.println("Given string are not match");
        }else{
        System.out.println("given string match");
    }
}
}
