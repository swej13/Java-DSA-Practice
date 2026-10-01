package dsa;

// Q5. Write a Java program to check whether a string is a palindrome using a stack.
// Input: MADAM
// Output: Palindrome

class PalindromeStack {

    public static void main(String[] args) {

        String str = "MADAM";

        char[] stack = new char[str.length()];
        int top = -1;

        // Push characters into stack
        for (int i = 0; i < str.length(); i++) {
            stack[++top] = str.charAt(i);
        }

        // Compare original string with reversed string
        boolean palindrome = true;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != stack[top--]) {
                palindrome = false;
                break;
            }
        }

        if (palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}