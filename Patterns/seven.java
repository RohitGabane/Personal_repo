 public class seven {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  "); 
            }

            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

