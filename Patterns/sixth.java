public class sixth
{
  public static void main(String[] args) {
    
    for(int i=3;i>=1;i--)
    {
        for(int s=i-1;s<=i;s--)
        {
            System.out.print(" ");
        }
        for(int j=3;j>=i;j--)
        {
           System.out.print(j);
        }
        System.out.println();
    }
  }
}