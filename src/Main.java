import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        There are 8 primitive data tyres in Java
        1. byte
        2. short
        3. int
        4. long
        5. float
        6. double
        7. char
        8. boolean
        We tend to use int, double, and boolean the most.
         */
        System.out.println("Lab 1a");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number1 = scanner.nextInt();
        System.out.println("You entered: " + number1);

        System.out.println("Enter a second number: ");
        int number2 = scanner.nextInt();
        System.out.println("You entered: " + number1 + " and " + number2);
        //Perform the basic mathematical operations of +, -, /, * and %.
        System.out.println(" Adding " + number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println (" Subtracting " + number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(" Multiplying " + number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println(" Dividing " + number1 + " / " + number2 + " = " + (number1 / number2));
        System.out.println(" Dividing " + number1 + " % " + number2 + " = " + (number1 % number2));
        //Output the results of each operation.

        //Cut and past the code above but use doubles instead of integers.
        System.out.println("Enter a third number: ");
        double number3 = scanner.nextInt();
        System.out.println("You entered: " + number3);
        System.out.println("Enter a fourth number: ");
        double number4 = scanner.nextInt();
        System.out.println("You entered: " + number4);
        System.out.println("Adding " + number3 + " + " + number4 + " = " + (number3 + number4));
        System.out.println ("Subtracting " + number3 + " + " + number4 + " = " + (number3 + number4));
        System.out.println(" Multiplying " + number3 + " * " + number4 + " = " + (number3 * number4));
        System.out.println(" Dividing " + number3 + " / " + number4 + " = " + (number3 / number4));
        System.out.println(" Dividing " + number3 + " % " + number4 + " = " + (number3 % number4));

        //If you complete this ask for the next task.
    }


}