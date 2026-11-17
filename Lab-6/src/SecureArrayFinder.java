import java.util.InputMismatchException;
import java.util.Scanner;

public class SecureArrayFinder {
    public static void main(String[] args) {

        System.out.println("Planet Finder");
        String[] planets = {"Earth", "Mars", "Venus", "Mercury", "Jupiter"};
        Scanner scan = new Scanner(System.in);

        System.out.print("Which index would you like to see? (0-4): ");

        try {

            int index = scan.nextInt();
            System.out.println("Selected planet: " + planets[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds! Enter a number from 0 to 4.");

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");

        } finally {
            System.out.println("Thank you for using the Planet Finder.");
        }
        scan.close();
    }
}