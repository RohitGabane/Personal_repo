public class Diamondsec {
        public static void main(String[] args) {
            int n =5;
            int x = 0;
            for(int i = 1; i<=n; i++)
            {
                if((n+1)/2 >=i )
                {
                    x++;
                }
                else
                x--;
                
                for(int j =1; j<=n; j++)
                {
                    
                    if(j<=x)
                    {
                        System.out.print("* ");
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
    

