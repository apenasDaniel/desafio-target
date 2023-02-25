import java.util.Scanner;

public class StringInverter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string to invert: ");
        String originalString = scan.nextLine();
        String invertedString = "";
        for (int i = originalString.length() - 1; i >= 0; i--) {
            invertedString += originalString.charAt(i);
        }
        System.out.printf("Original string: %s\n", originalString);
        System.out.printf("Inverted string: %s\n", invertedString);
    }

}
