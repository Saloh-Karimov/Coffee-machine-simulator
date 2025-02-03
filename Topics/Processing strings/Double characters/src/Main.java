import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] characters = input.split("");
        StringBuilder output = new StringBuilder();

        for (String character: characters) {
            output.append(character).append(character);
        }
        System.out.println(output);
        scanner.close();
    }
}