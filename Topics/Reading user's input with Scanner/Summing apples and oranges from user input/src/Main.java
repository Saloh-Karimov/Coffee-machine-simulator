import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Use a Scanner to read user input

        int numberOfApples = sc.nextInt();
        int numberOfOranges = sc.nextInt();

        // Calculate the total number of fruits and print the result
        System.out.println(numberOfApples + numberOfOranges);

        sc.close();
    }
}