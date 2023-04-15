import java.util.Scanner;

public class Factors {
    //all factors are <= n/2
    //square root of n will be in middle of factors list
    //negative factors??
    static void getFactors(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.printf("(%d, %d)\n", i, n / i);
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
