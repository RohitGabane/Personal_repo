public class DiamondFour
 {
    public static void main(String[] args) {
        int n=7;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=n;j++)
            {

               if(j>5-i && j<3+i)
               {
                System.out.print("  ");
               }
               else{
                System.out.print("* ");
               }
            }
            System.out.println();
        }
        
    }
    
}
