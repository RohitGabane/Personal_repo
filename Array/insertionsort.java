//Q4. Accept 5 number in an array and sort it (insertion sort) 

import java.util.Scanner;

public class insertionsort 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 5 element of first array: ");
        int []arr=new int[5];
                System.out.println("Enter the 5 element of second array: ");

        int []arr1=new int[5]; //second array
        //take 1st array from user
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

       //Take second array from user
for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }

// iteraated using the insertion sort this is 1st rray
        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }


        // iteraated using the insertion sort this is 2nd array
        for(int i=1;i<arr1.length;i++)
        {
            int key=arr1[i];
            int j=i-1;

            while(j>=0 && arr1[j]>key)
            {
                arr1[j+1]=arr1[j];
                j--;
            }
            arr1[j+1]=key;
        }
        int[] mergedArray = new int[arr.length + arr1.length];
        int i = 0, j = 0, k = 0;

        while (i < arr.length && j < arr1.length) {
            if (arr[i] < arr1[j]) {
                mergedArray[k++] = arr[i++];
            } else {
                mergedArray[k++] = arr1[j++];
            }
        }

        while (i < arr.length) {
            mergedArray[k++] = arr[i++];
        }

        while (j < arr1.length) {
            mergedArray[k++] = arr1[j++];
        }
           //diplay the 1st array
        System.out.println("Display the sorted array: ");
        for(int num:arr)
        {
            System.out.println(num + " " );
        }


           //diplay the 2nd array
        System.out.println("Display the sorted array: ");
        for(int num:arr1)
        {
            System.out.println(num + " " );
        }
        sc.close();
    }
    
}
