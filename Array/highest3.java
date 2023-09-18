import java.util.*;
public class highest3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[10];
        System.out.println("Enter the 10 elements: ");

        for(int i=0;i<arr.length-1;i++)
        {
          arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            int maxIndex=i;
            for(int j=i+1;j<arr.length;j++)
            {
               if(arr[j]>arr[maxIndex])
               {
                maxIndex=j;
               }
            }
            int temp=arr[i];
               arr[i]=arr[maxIndex];
               arr[maxIndex]=temp;

        }
         System.out.println("Display the array : ");
            for(int s=0;s<3;s++)
            {
                System.out.print(arr[s]+" ");
            }
    }
    
}
