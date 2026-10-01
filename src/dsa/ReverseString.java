package dsa;
//Q2. Write a Java program to reverse a string using a stack.
//Input: HELLO
//Output: OLLEH

class ReverseString {
 public static void main(String[] args) {

     String str = "HELLO";
     char[] stack = new char[str.length()];
     int top = -1;

     for (int i = 0; i < str.length(); i++)
         stack[++top] = str.charAt(i);

     while (top >= 0)
         System.out.print(stack[top--]);
 }
}