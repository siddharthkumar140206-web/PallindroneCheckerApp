// USE CASE 2
import java.util.Scanner;

public class PallindroneCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Palindrone Checker App Management System");
        System.out.println("Enter a string (lower case):");

        String s = sc.nextLine();
        boolean isPalindrome = true;

        // Loop only till half of the string length
        for (int i = 0; i < s.length() / 2; i++) {

            // Compare characters from start and end
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}
