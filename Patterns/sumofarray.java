import java.io.*;
import java.util.*;
class Result {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i); // Use ar.get(i) to access elements in a List
        }
        return sum;
    }

}

public class sumofarray {
    public static void main(String[] args) throws IOException {
        Result r = new Result();
        List<Integer> ar = Arrays.asList(1, 3, 2, 4, 10, 11); // Create a List<Integer>
        int result = Result.simpleArraySum(ar);
        System.out.println(result); // Print the result
    }
}
