// public class eight
// {
//     public static void main(String[] args) {
//         int count=1;
//         for(int i=1;i<=3;i++)
//         {
//         for(int j=i;j<=1;j++)
//         {
//           System.out.print(count + " ");
//           System.out.println(j);
//         }
//         System.out.println();
//         count++;
//     }
// }
// }
public class eight {
    public static void main(String[] args) {
        int n = 3; // Number of rows
        int currentNumber = 1;

        for (int i = 1; i <= n; i++) {
            for(int s=i+1;s<=i;s++)
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber + " ");
            }
            System.out.println();
            currentNumber++;
        }
    }
}
