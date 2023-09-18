
//Q2. Accept 5 number in an array and sort it (bubble sort) 
import java.util.*;

public class bublesort {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 arr: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            //sc.close();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        System.out.print("Display the Sorted Array: ");
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
