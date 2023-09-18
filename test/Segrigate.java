//Segregate positive and negative integers in linear time
//Given an array of positive and negative integers, the output should print all negative numbers,
//followed by all positive numbers.
// Input: [19, -13, 15, -12, -18, -16, 1, 3]
// Output: [-13, -12, -18, -16, 15, 19, 1, 3
// After showing above output copy this data into another array and sort it.
import java.util.*;

public class Segrigate {
    public static void main(String[] args) {
        int[] input = {19, -13, 15, -12, -18, -16, 1, 3};
        
        segnum(input);
        
        int[] sortArr = Arrays.copyOf(input, input.length);
        Arrays.sort(sortArr);
        
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(sortArr));
    }
    
    public static void segnum(int[] arr) {
        int L = 0;
        int R = arr.length - 1;
        
        while (L <= R) {
            if (arr[L] < 0) {
                L++;
            } 
            else if (arr[R] >= 0) {
                R--;
            } else {
                int temp = arr[L];
                arr[L] = arr[R];
                arr[R] = temp;
                L++;
                R--;
            }
        }
    }
}

