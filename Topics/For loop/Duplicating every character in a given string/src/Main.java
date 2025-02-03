import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Scanner class
        Scanner scanner = new Scanner(System.in);

        // Read the input string from the user
        String input = scanner.nextLine();

        // Initialize a new string to store the result
        String s = input.replaceAll(".", "$0$0");

        // Print the result to the standard output
        System.out.println(s);

        scanner.close();
    }
}