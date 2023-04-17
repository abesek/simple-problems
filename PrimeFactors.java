import java.util.Scanner;

public class PrimeFactors {
    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    static void getFactors(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                int x = n;
                while (x % i == 0) {
                    System.out.println(i);
                    x /= i;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        sc.close();
        getFactors(n);
    }
}