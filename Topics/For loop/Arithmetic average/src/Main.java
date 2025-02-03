import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input numbers a and b
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //initialize sum, count and arithmetic average
        int sum = 0;
        int count = 0;
        double arithmeticAverage = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }
        arithmeticAverage = (double) sum / count;
        System.out.println(arithmeticAverage);
        scanner.close();
    }
}