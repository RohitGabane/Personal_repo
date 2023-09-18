import java.util.Arrays;
public class secondhigest
{ 
        public static void main(String[] args)
    {
        int [] number={5};
        secondmallest(number);
    }
    static void secondmallest(int[] arr)
    {
        int secondsmallnumber=Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElseThrow(null);
        System.out.println("The second Array: " +secondsmallnumber);
    }  
}
