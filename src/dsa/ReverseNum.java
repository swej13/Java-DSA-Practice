package dsa;

// Q3. Write a Java program to reverse the digits of an integer using a stack.
// Input: 12345
// Output: 54321
// Test with 90876

class RevNumber1 {

    public static void main(String[] args) {

        int num = 90876;

        int[] stack = new int[10];
        int top = -1;

        while (num > 0) {
            stack[++top] = num % 10;
            num = num / 10;
        }

        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i]);
        }
    }
}