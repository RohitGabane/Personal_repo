//Q5. Accept two string append 1st one with the second one 

import java.util.Scanner;

public class strring5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entefr the First string: ");
        String str1=sc.nextLine();
        System.out.println("enter the second String: ");
        String str2=sc.nextLine();

        String result=Appendstring(str1,str2);
        System.out.println("the appending string: "+result);
        sc.close();

    }
    public static String Appendstring(String s1,String s2)
    {
        return s1 + s2;
    }
}
