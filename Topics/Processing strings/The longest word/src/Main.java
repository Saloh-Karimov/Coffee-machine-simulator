import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String longest = "";

        //Split the input by spaces, get an array
        String[] words = input.split(" ");

        for (String word: words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println(longest);
        scanner.close();


    }
}