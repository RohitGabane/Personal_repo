//Q2. Find Fibonacci series in following pattern

public class logictest22 
{
        public static int fib(int n) {
            if (n<=1) {
                return n;
            } else {
                return fib(n-1) + fib(n-2);
            }
        }
    
        public static void main(String[] args) {
            int m = 10;
            System.out.println("fib Series: ");
            for (int i=0;i<m; i++) 
            {
                System.out.print(fib(i) + " ");
            }
        }
    }
    

