public class pattern21 {
    public static void main(String[] args) {
        int row=7;
        for(int i=0;i<row;i++)
        {
            for(int s=0;s<row-i-1;s++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<row-1;i++)
        {
            for(int s=0;s<=i;s++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<row-i-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
