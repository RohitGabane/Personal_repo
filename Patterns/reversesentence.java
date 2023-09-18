import java.util.Scanner;

public class reversesentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter sentencw");
        String s=sc.nextLine().trim();
        String[]arr=s.split("\\s+");
        String[]result=new String[arr.length];
        int k=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            result[k++]=arr[i];
            //System.out.print(result[i]);
        }
        for (String string : result) {
            System.out.print(string +" ");
        }

    }
}
