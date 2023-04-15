import java.util.Scanner;

public class Factorial {
    static int factorial(int n) {
        int result = 1;
        if (n < 0) return -1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    //exp complexity
    static int factorialRecr(int n) {
        if (n < 0) return -1;
        if (n < 2) return 1;
        return n * factorialRecr(n-1);     
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(factorial(n));
        System.out.println(factorialRecr(n));
    }
}
