package palindromecheckerapp;

import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Two Pointer Approach
    public static boolean twoPointerCheck(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Method 2: Stack Approach
    public static boolean stackCheck(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Method 3: Reverse String Approach
    public static boolean reverseCheck(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        String reversed = new StringBuilder(str).reverse().toString();

        return str.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Two Pointer Timing
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long end1 = System.nanoTime();

        // Stack Timing
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long end2 = System.nanoTime();

        // Reverse String Timing
        long start3 = System.nanoTime();
        boolean result3 = reverseCheck(input);
        long end3 = System.nanoTime();

        System.out.println("\nPalindrome Results:");
        System.out.println("Two Pointer: " + result1 + " | Time: " + (end1 - start1) + " ns");
        System.out.println("Stack: " + result2 + " | Time: " + (end2 - start2) + " ns");
        System.out.println("Reverse String: " + result3 + " | Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}
