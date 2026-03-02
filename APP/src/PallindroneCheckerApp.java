//USE CASE 9
import java.util.Scanner;

public class PallindroneCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Welcome to Palindrome Checker App Management System");
        System.out.println("Enter a string(lower case):");
        s = sc.nextLine();

        s = s.toLowerCase();

        boolean result = check(s, 0, s.length() - 1);

        System.out.println("Is Palindrome?: " + result);

        sc.close();
    }

    private static boolean check(String s, int start, int end) {

        // Base case: pointers have crossed or met
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return check(s, start + 1, end - 1);
    }
}