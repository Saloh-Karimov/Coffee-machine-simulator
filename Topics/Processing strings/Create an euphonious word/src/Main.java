import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine(); // Read input word
        int minChars = countEuphonious(word, 0);
        System.out.println(minChars);
    }

    public static int countEuphonious(String word, int index) {
        // Base case: end of string
        if (index >= word.length() - 2) {
            return 0;
        }

        // Check the current sequence of 3 characters
        char first = word.charAt(index);
        char second = word.charAt(index + 1);
        char third = word.charAt(index + 2);

        // Check if the sequence is all vowels or all consonants
        if ((isVowel(first) && isVowel(second) && isVowel(third)) ||
                (isConsonant(first) && isConsonant(second) && isConsonant(third))) {
            // Insert a character to break the sequence
            // Move the index forward by 2 to skip the next two characters
            return 1 + countEuphonious(word, index + 2);
        } else {
            // Move to the next character
            return countEuphonious(word, index + 1);
        }
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y');
    }

    public static boolean isConsonant(char c) {
        return !isVowel(c) && Character.isLetter(c);
    }
}