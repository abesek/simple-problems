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
     * looks much like iterative approach. swapping on recursive call and printing
     * a+b.
     * Could be improved.
     * Hint: Recursion is useful for computing solution by solving sub problems.
     */
    static void computeFibonacciRecursive(int n, int a, int b, int i) {
        if (n < 1 || i >= n) {
            return;
        }
        if (i == 0 || i == 1) {
            System.out.println(i);
            computeFibonacciRecursive(n, a, b, ++i);
        } else {
            System.out.println(a + b);
            computeFibonacciRecursive(n, b, a + b, ++i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sequence length: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Iterative version:");
        computeFibonnaciIterative(n);
        System.out.println("Recursive version:");
        computeFibonacciRecursive(n, 0, 1, 0);
    }
}