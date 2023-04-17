import java.util.Scanner;

public class PythagoreanPrime {
    static boolean isPythagoreanPrime(int n) {
        return isPrime(n) && n % 4 == 1;
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(isPythagoreanPrime(n));
    }    
}
