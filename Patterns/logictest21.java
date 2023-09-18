public class logictest21 
{
    public static void main(String[] args) 
    {
        int n=6;
        int fact=calfact(n);
        System.out.println(fact);
    }
    public static int calfact(int n)
    {
        if(n==0 || n==1)
        {
        return 1;
        }
        return n* calfact(n-1);
    }
}
