// USE CASE 5
import java.util.Scanner;
import java.util.Stack;

public class PallindroneCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Welcome to Palindrome Checker App Management System");
        System.out.println("Enter a string(lower case):");
        s = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Iterate again through original string
        for (char c : s.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Is not a Palindrome");
        }
        sc.close();

    }
}
