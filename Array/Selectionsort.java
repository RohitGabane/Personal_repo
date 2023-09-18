// //Q3. Accept 5 number in an array and sort it (selection sort) 
// import java.util.*;
// public class Selectionsort 
// {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int []arr=new int[5];
//         System.out.println("Enter the Five arr: ");
//         for(int i=0;i<arr.length-1;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("The Give array input taken from the users: ");

//         for (int i = 0; i < arr.length - 1; i++) {
//             int minIndex = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] < arr[minIndex]) {
//                     minIndex = j;
//                 }
//             }

//             // Swap arr[i] and arr[minIndex]
//             int temp = arr[i];
//             arr[i] = arr[minIndex];
//             arr[minIndex] = temp;
//         }

//         System.out.println("the sorted array is: ");
//         for(int num:arr)
//         {
//             System.out.println(num + " ");
//         }


//     }
// }
import java.util.*;
public class Selectionsort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[5];
        System.out.println("Enter 5 element: ");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length-1;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minIndex]>arr[j])
                {
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        System.out.println("Display the sorted array");
        for(int num:arr)
        {
            System.out.println(num+ " ");
        }

    }
}