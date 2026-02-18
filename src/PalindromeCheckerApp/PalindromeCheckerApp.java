public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Step 1: Declare and initialize original string
        String originalString = "radar";

        // Step 2: Create an empty string to store reversed value
        String reversedString = "";

        // Step 3: Reverse the string using for loop
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + originalString.charAt(i);
        }

        // Step 4: Compare original and reversed string using equals()
        if (originalString.equals(reversedString)) {
            System.out.println("The given string \"" + originalString + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + originalString + "\" is NOT a Palindrome.");
        }

        // Program exits
    }
}
