public class reversepattrn {
    public static void main(String[] args) {
        int n=7;
        int x=0;
        boolean k=true;
        for(int i=1;i<=n;i++)
        {
            if((n+1)/2>=i)
            {
                x++;
            }
            else
            {
                x--;
            }
            
             for(int j=1;j<=n;j++)
             {
                
                if(j>=5-x && j<=3+x && k)
                {
                    System.out.print("*");
                    k=false;
                }
                else{
                    System.out.print(" ");
                    k=true;
                }
             }
             System.out.println();
        }
    }
    
}
