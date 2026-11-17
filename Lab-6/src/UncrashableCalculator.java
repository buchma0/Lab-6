import java.util.InputMismatchException;
import java.util.Scanner;

public class UncrashableCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Uncrashable Calculator");

        while (true) {

            System.out.print("Enter operation (+, -, *, /) or 'exit' to quit: ");
            String operation = scan.next();

            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Exiting calculator.");
                break;
            }

            try {

                System.out.print("Enter first number: ");
                int num1 = scan.nextInt();

                System.out.print("Enter second number: ");
                int num2 = scan.nextInt();

                switch (operation) {
                    case "+":
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case "-":
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case "*":
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case "/":
                        System.out.println("Result: " + (num1 / num2));
                        break;
                    default:
                        System.out.println("Unknown operation!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Input error! Please enter integers only.");
                scan.nextLine();

            } catch (ArithmeticException e) {
                System.out.println("Math error: division by zero!");
            }
        }
        scan.close();
    }
}
