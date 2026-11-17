import java.util.Scanner;

public class Main {

    // 1. The Spelling Bee
    // public static void main(String[] args) { System.out.println("Hello"); }

    // 2. The Missing Link
    public static void missingLink() {
        System.out.println("\nMissing Link:");
        String text = null;
        System.out.println(text.length()); // NullPointerException
    }

    // 3. Fencepost Error
    public static void fencepostError() {
        System.out.println("\nFencepost Error:");
        int[] numbers = {10, 20, 30};
        for (int i = 0; i <= numbers.length; i++) { //ArrayIndexOutOfBoundsException
            System.out.println(numbers[i]);
        }
    }

    // 4. The Zero Guard
    public static void zeroGuard(int dividend, int divisor) {
        System.out.println("\nZero Guard:");
        if (divisor == 0) {
            System.out.println("Cannot divide!");
        } else {
            System.out.println("Result: " + (dividend / divisor));
        }
    }

    // 5. Multi-Catch
    public static void multiCatch(int mode) {
        System.out.println("\nMulti-Catch:");
        try {
            if (mode == 1) {
                int res = 10 / 0; // ArithmeticException
            } else {
                int[] arr = {1, 2};
                int val = arr[5]; // ArrayIndexOutOfBoundsException
            }
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Division by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index out of bounds.");
        }
    }

    // 6. The Automatic Closer
    public static void automaticCloser() {
        System.out.println("\nAutomatic Closer (try-with-resources):");
        // Scanner is automatically closed when try block finishes
        try (Scanner scan = new Scanner("Sample Input")) {
            if (scan.hasNext()) {
                System.out.println("Read from auto-closed scanner: " + scan.next());
            }
        }
    }

    // 7. Logic Flip
    public static int add(int a, int b) {
        return a + b; // Fixed from a - b (Logical error fix)
    }

    public static void logicFlip() {
        System.out.println("\nLogic Flip:");
        System.out.println("Corrected add(5, 3) result: " + add(5, 3));
    }

    // 8. The "Finally" Test
    public static void finallyTest() {
        System.out.println("\nFinally Test:");
        try {
            System.out.println("Inside try block: Operation successful.");
        } catch (Exception e) {
            System.out.println("Inside catch block.");
        } finally {
            System.out.println("Proof: The finally block still runs!");
        }
    }

    // 9. Duck the Responsibility
    public static void riskyMethod() throws ArithmeticException {
        int x = 10 / 0; // Throws ArithmeticException up to the caller
    }

    public static void duckResponsibility() {
        System.out.println("\nDuck the Responsibility:");
        riskyMethod();
    }

    // 10. The Stack Buster
    public static void infiniteRecursion() {
        infiniteRecursion(); // StackOverflowError
    }

    public static void task10_StackBuster() {
        System.out.println("\nStack Buster:");
        infiniteRecursion();
    }

    public static void main(String[] args) {

        // 2. The Missing Link NullPointerException
        // task2_MissingLink();

        // 3. Fencepost Error ArrayIndexOutOfBoundsException
        // task3_FencepostError();

        // 4. The Zero Guard
        zeroGuard(10, 0);
        zeroGuard(10, 2);

        // 5. Multi-Catch
        multiCatch(1);
        multiCatch(2);

        // 6. The Automatic Closer
        automaticCloser();

        // 7. Logic Flip
        logicFlip();

        // 8. The "Finally" Test
        finallyTest();

        // 9. Duck the Responsibility
        // task9_duckResponsibility();

        // 10. The Stack Buster StackOverflowError
        // task10_StackBuster();
    }
}

