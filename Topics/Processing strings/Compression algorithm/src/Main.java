import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Initialise variables
        String input = scanner.nextLine();
        char currentChar = input.charAt(0);
        int count = 1;
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                result.append(currentChar).append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }
        result.append(currentChar).append(count);
        System.out.println(result);
    }
}
