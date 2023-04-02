import java.util.Scanner;

public class Fibonacci {
    static void computeFibonnaciIterative(int n) {
        int a = 0, b = 1, c = 0;
        if (n < 1) {
            System.out.println(-1);
            return;
        }
        if (n == 1) {
            System.out.println(0);
            return;
        }
        System.out.printf("%d\n%d\n", 0, 1);
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }

    /*
     * using sub problems approach. O(n times 2 power n) -- Bad.
     */
    static int computeNthFibonacciRecursive(int n) {
        if (n == 0 || n ==1) {
            return n;
        }
        return computeNthFibonacciRecursive(n-1) + computeNthFibonacciRecursive(n-2);        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sequence length: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Iterative version:");
        computeFibonnaciIterative(n);
        System.out.println("Recursive version:");
        for (int i = 0; i < n; i++) {
            System.out.println(computeNthFibonacciRecursive(i));
        }
    }
}