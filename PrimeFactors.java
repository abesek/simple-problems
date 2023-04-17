import java.util.Scanner;

public class PrimeFactors {
    static void getFactors(int n) {
        int largestPrimeFactor = -1;
        //remove all factors of 2
        while (n % 2 == 0) {
            System.out.println(2);
            n /= 2;
            largestPrimeFactor = 2;
        }
        //n is odd by this point
        for (int i = 3; i <= Math.sqrt(n); i += 2) { //skip even numbers
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
                largestPrimeFactor = i;
            }
        }
        if (n > 1) { 
            System.out.println(n); 
            largestPrimeFactor = n; 
        }
        System.out.println("Largest Prime Factor = " + largestPrimeFactor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        sc.close();
        getFactors(n);
    }
}