package dsa;
//Q1. Write a Java program to implement a stack using an integer array.
//Perform: Push 10, 20, 30, 40; Display; Peek; Pop two elements; Display again.
//Show appropriate messages for overflow and underflow.

class StackArray {
 int[] stack = new int[5];
 int top = -1;

 void push(int x) {
     if (top == stack.length - 1)
         System.out.println("Stack Overflow");
     else
         stack[++top] = x;
 }

 void pop() {
     if (top == -1)
         System.out.println("Stack Underflow");
     else
         System.out.println("Popped: " + stack[top--]);
 }

 void peek() {
     if (top == -1)
         System.out.println("Stack is Empty");
     else
         System.out.println("Peek: " + stack[top]);
 }

 void display() {
     if (top == -1)
         System.out.println("Stack is Empty");
     else {
         for (int i = top; i >= 0; i--)
             System.out.print(stack[i] + " ");
         System.out.println();
     }
 }

 public static void main(String[] args) {
     StackArray s = new StackArray();

     s.push(10);
     s.push(20);
     s.push(30);
     s.push(40);

     s.display();
     s.peek();

     s.pop();
     s.pop();

     s.display();
 }
}