package myhelloworld;

import java.util.Scanner;

public class StackPalindrome {
    private char[] stack;
    private int top;

    // Constructor to initialize the stack with the size of the input string
    public StackPalindrome(int capacity) {
        stack = new char[capacity];
        top = -1;
    }

    // Method to push an element onto the stack
    public void push(char ch) {
        if (top < stack.length - 1) {
            stack[++top] = ch;
        }
    }

    // Method to pop an element from the stack
    public char pop() {
        if (top >= 0) {
            return stack[top--];
        }
        return '\0';
    }

    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String str) {
        int length = str.length();
        StackPalindrome stack = new StackPalindrome(length);

        // Push each character onto the stack
        for (int i = 0; i < length; i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i < length; i++) {
            reversed.append(stack.pop());
        }

        // Compare original string with the reversed string
        return str.equals(reversed.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Program for palindrome application of stack in array---");
        System.out.print("Enter a string to check if it's a palindrome: ");
        String userinput = sc.nextLine();

        if (isPalindrome(userinput)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}
