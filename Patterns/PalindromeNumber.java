public class PalindromeNumber {
    public static void main(String[] args) {
        int number=129;
        if(palindrom(number))
        {
           System.out.println("is palinndrome number: ");
          }
          
        else
        {
           System.out.println("is not palinndrome number: ");
        }
    }
    public static boolean palindrom(int number)
    {
        int originalnumber=number;
       int  reverednumber=0;

       while(number>0)
       {
        int lastdigit=number%10;
        reverednumber=reverednumber*10+lastdigit;
        number/=10;
       }
      return originalnumber==reverednumber;
    }
}
