public class Diamond {
    public static void main(String[] args) {
        int n =5;
        int x = 0;
        for(int i = 1; i<=n; i++)
        {
            if((n+1)/2>=i)
                {
                    x++;
                }
                else
                    x--;
            for(int j =1; j<=n; j++)
            {
                
                if(j>=4-x && j<=2+x)
                {
                    System.out.print("*_");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
