//USE CASE 8

import java.util.Scanner;
import java.util.LinkedList;

public class PallindroneCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        LinkedList<Character> list = new LinkedList<>();

        for (char c : s.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        while (list.size() > 1) {
            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + s);
        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}