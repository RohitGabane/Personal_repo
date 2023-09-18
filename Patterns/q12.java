import java.util.*;
public class q12 {
   public static void main(String[] args)
   {
   Scanner sc=new Scanner(System.in);
      System.out.println("enter number ");

   int n=sc.nextInt();
   //int count=1;
   for(int i=1;i<=n;i++)
   {
      for(int j=1;j<=i;j++)
      {
         System.out.print(i-j+1);
        // count++;
      }
      System.out.println();
   }
   }
}
