import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String s) {
        s = s.toLowerCase(); // case insensitive
        for (int i = 0, j = s.length()-1; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = sc.nextLine();
        sc.close();
        System.out.println(isPalindrome(input));
        System.out.println(input); //input not changed by toLowerCase as Strings are immutable
    }
}
