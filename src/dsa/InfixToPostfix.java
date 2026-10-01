package dsa;
// Q8. Write a Java program to convert an infix expression into postfix notation using a stack.
class InfixToPostfix {
    static int priority(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        if (ch == '*' || ch == '/')
            return 2;

        return 0;
    }
    static String convert(String exp) {

        char[] stack = new char[20];
        int top = -1;
        String result = "";
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            // Operand
            if (Character.isLetterOrDigit(ch)) {
                result += ch;
            }
            // Opening bracket
            else if (ch == '(') {
                stack[++top] = ch;
            }
            // Closing bracket
            else if (ch == ')') {

                while (top >= 0 && stack[top] != '(')
                    result += stack[top--];
                top--; // remove '('
            }
            // Operator
            else {

                while (top >= 0 &&
                       stack[top] != '(' &&
                       priority(stack[top]) >= priority(ch)) {

                    result += stack[top--];
                }
                stack[++top] = ch;
            }
        }
        // Pop remaining operators
        while (top >= 0)
            result += stack[top--];
        return result;
    }
    public static void main(String[] args) {
        String exp = "A+B*C";
        System.out.println("Infix: " + exp);
        System.out.println("Postfix: " + convert(exp));
    }
}