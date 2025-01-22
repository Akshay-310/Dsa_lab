package myhelloworld;
import java.util.Scanner;

public class PalindromeChecker {
    private char[] stack;
    private int top;

    public PalindromeChecker(int size) {
        stack = new char[size];
        top = -1;
    }

    public void push(char ch) {
        if (top < stack.length - 1) {
            stack[++top] = ch;
        } else {
            System.out.println("Stack overflow");
        }
    }

    public char pop() {
        if (top >= 0) {
            return stack[top--];
        } else {
            System.out.println("Stack underflow");
            return '\0';
        }
    }

    public static boolean isPalindrome(String input) {
        int length = input.length();
        PalindromeChecker stack = new PalindromeChecker(length);

        for (int i = 0; i < length; i++) {
            stack.push(input.charAt(i));
        }

        for (int i = 0; i < length; i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program to check whether the input string is palindrome or not.\n");
        System.out.print("Enter text here: ");
        String mysc = scanner.nextLine();

        if (isPalindrome(mysc)) {
            System.out.println(mysc + " is palindrome");
        } else {
            System.out.println(mysc + " is not palindrome");
        }
        
        scanner.close();

    }
}
