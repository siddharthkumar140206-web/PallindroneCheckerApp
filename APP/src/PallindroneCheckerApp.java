//USE CASE 11
import java.util.Scanner;

public class PallindroneCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Palindrome Checker App Management System");
        System.out.println("Enter a string:");

        String input = sc.nextLine();
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        boolean result = PalindromeService.check(normalized, 0, normalized.length() - 1);

        System.out.println("Is Palindrome?: " + result);

        sc.close();
    }
    class PalindromeService {

        public static boolean check(String s, int start, int end) {

            if (start >= end) {
                return true;
            }
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            return check(s, start + 1, end - 1);
        }
    }
}