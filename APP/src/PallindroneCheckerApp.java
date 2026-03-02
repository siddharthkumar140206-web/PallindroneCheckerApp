// USE CASE 13
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class PallindroneCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();
        input = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        long startRecursive = System.nanoTime();

        boolean recursiveResult = recursiveCheck(input, 0, input.length() - 1);

        long endRecursive = System.nanoTime();
        long recursiveTime = endRecursive - startRecursive;

        long startDeque = System.nanoTime();

        boolean dequeResult = dequeCheck(input);

        long endDeque = System.nanoTime();
        long dequeTime = endDeque - startDeque;


        System.out.println("\nRecursive Result: " + recursiveResult);
        System.out.println("Recursive Execution Time: " + recursiveTime + " ns");

        System.out.println("\nDeque Result: " + dequeResult);
        System.out.println("Deque Execution Time: " + dequeTime + " ns");

        sc.close();
    }


    private static boolean recursiveCheck(String s, int start, int end) {

        if (start >= end)
            return true;

        if (s.charAt(start) != s.charAt(end))
            return false;

        return recursiveCheck(s, start + 1, end - 1);
    }

    private static boolean dequeCheck(String input) {

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