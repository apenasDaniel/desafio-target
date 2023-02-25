import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number to check if it belongs to the Fibonacci sequence:");
        int number = scan.nextInt();

        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber = firstNumber + secondNumber;
        boolean belongsToFibonacciSequence = false;

        while (nextNumber <= number) {
            if (number == nextNumber) {
                belongsToFibonacciSequence = true;
                break;
            }
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            nextNumber = firstNumber + secondNumber;
        }

        if (belongsToFibonacciSequence) {
            System.out.println(number + " belongs to the Fibonacci sequence.");
        } else {
            System.out.println(number + " does not belong to the Fibonacci sequence.");
        }

        scan.close();
    }

}
