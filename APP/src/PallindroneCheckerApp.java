// USE CASE 12
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class PallindroneCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();
        PalindromeStrategy strategy = new DequeStrategy();
        boolean result = strategy.check(input);

        System.out.println("Is Palindrome?: " + result);

        sc.close();
    }
}
interface PalindromeStrategy {
    boolean check(String input);
}
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {

            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}