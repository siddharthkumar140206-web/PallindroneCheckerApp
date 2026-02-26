// USE CASE 7
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class PallindroneCheckerApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Welcome to Palindrome Checker App Management System");
        System.out.println("Enter a string(lower case):");
        s=sc.nextLine();

        Deque<Character> deque = new ArrayDeque<>();


        // Push each character of the string into the stack
        for (char c : s.toCharArray()) {
            deque.addLast(c);

        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Iterate again through original string
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                        isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Is not a Palindrome");
        }
        sc.close();
    }
}