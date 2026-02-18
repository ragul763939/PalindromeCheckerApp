import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String originalString = "madam";

        // Create Stack of Characters
        Stack<Character> stack = new Stack<>();

        // Step 1: Push each character into stack
        for (int i = 0; i < originalString.length(); i++) {
            stack.push(originalString.charAt(i));
        }

        // Step 2: Pop characters and build reversed string
        String reversedString = "";

        while (!stack.isEmpty()) {
            reversedString = reversedString + stack.pop();
        }

        // Step 3: Compare original and reversed string
        if (originalString.equals(reversedString)) {
            System.out.println("The given string \"" + originalString + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + originalString + "\" is NOT a Palindrome.");
        }

        // Program exits
    }
}

