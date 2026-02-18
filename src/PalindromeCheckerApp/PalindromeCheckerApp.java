package PalindromeCheckerApp;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

// UC1: Welcome
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        System.out.println();

// UC2: Print a Hardcoded Palindrome Result
        System.out.println("UC2: Hardcoded Palindrome Validation");
        String input = "madam"; // hardcoded string

        boolean isPalindrome = true;

// compare characters from both ends (only till half length)
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a PALINDROME");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome");
        }
    }
}
