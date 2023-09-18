import java.util.Scanner;

public class third
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int n=sc.nextInt();
    sc.close();
    for(int i=1;i<=n;i++)
    {
        for(int s=n-1;s>=i;s--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
           System.out.print(j);
        }
        System.out.println();
    }
  }
}