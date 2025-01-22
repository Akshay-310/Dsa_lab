package myhelloworld;

public class SwapVariable {
    public static void main(String[] args) {
        
        // swaping the value without using 3rd variable
        int number1 = 8;
        int number2 = 16;

        // Swapping by using arthemetic operation
        number1 = number1 + number2;
        number2 = number1 - number2; 
        number1 = number1 - number2; 

        System.out.println("After swapping the numbers:");
        System.out.println("Num1 = " +number1);
        System.out.println("Num2 = " +number2);
    }

}
