import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input the values of a and b
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //initialize the product variable
        long product = 1;

        for (int i = a; i < b; i++) {
            product *= i;
        }
        System.out.println(product);
        scanner.close();
    }
}