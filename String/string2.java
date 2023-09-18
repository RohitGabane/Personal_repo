// Accept string and check if it is palindrome or not e.g (nitin) 
  import java.util.*;  
public class string2
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A string");
        String input=sc.nextLine();
sc.close();
        if(isPalindrome(input))
        {
            System.out.println("the given string is palindrom");
        }
        else{
            System.out.println("not pslindrom");
        }

    }
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}
