// USE CASE 4
import java.util.Scanner;
public class PallindroneCheckerApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Welcome to Palindrome Checker App Management System");
        System.out.println("Enter a string(lower case):");
        s=sc.nextLine();

        char [] chars= s.toCharArray();

        int start =0;
        int end=chars.length - 1;

        boolean isPalindrome=true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
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