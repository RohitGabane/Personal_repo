//Q7. Accept 5 name from user and print their name in ascending order

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class string7 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]names=new String[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the Name: "+(i+1)+": ");
            names[i]=sc.nextLine();
        }
        Arrays.sort(names);
        System.out.println("the ascending list: ");
        for(String name: names)
        {
            System.out.println(name);
        }
        sc.close();
    }
    
}
