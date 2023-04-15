import java.util.ArrayList;
import java.util.Scanner;

public class Narcissistic {
    static boolean isNarcissistic(int n) {
        int num = n, res = 0;
        ArrayList<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add(n % 10);
            n = n / 10;
        }
        for (int i : digits) {
            res += Math.pow(i, digits.size());
        }
        return res == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(isNarcissistic(n));
    }
}
