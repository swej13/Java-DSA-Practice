package dsa;

// Q7. Write a Java program to evaluate prefix expressions using a stack.
// Example: + 2 * 3 4
// Answer: 14

class PrefixEvaluation {

    public static void main(String[] args) {

        String exp = "+2*34";

        int[] stack = new int[20];
        int top = -1;

        // Scan from RIGHT to LEFT
        for (int i = exp.length() - 1; i >= 0; i--) {

            char ch = exp.charAt(i);

            // If operand, push
            if (Character.isDigit(ch)) {
                stack[++top] = ch - '0';
            }

            // If operator, pop two operands
            else {

                int a = stack[top--];
                int b = stack[top--];

                int result = 0;

                if (ch == '+')
                    result = a + b;
                else if (ch == '-')
                    result = a - b;
                else if (ch == '*')
                    result = a * b;
                else if (ch == '/')
                    result = a / b;

                stack[++top] = result;
            }
        }

        System.out.println("Result = " + stack[top]);
    }
}