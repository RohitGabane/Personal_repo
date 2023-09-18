//Q8. Accept 5 name from user , accept a name from user and check that name is there in array or not 

import java.util.Scanner;

public class string8 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String[]names=new String[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the Name: "+(i+1)+": ");
            names[i]=sc.nextLine();
        }
        System.out.println("Checking String from user: ");
        String str1=sc.nextLine();

        Boolean found=false;
        for(String name:names)
        {
            if(name.equals(str1))
            {
                found=true;
                break;
            }
        }
        if(found)
        {
            System.out.println(" the name  present in the given the array: ");
        }
        else{
        System.out.println("Not present in the given array:");
        }
        
        sc.close();
        

    }
}
