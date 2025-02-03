import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int airTemperature = sc.nextInt();
        int airHumidity = sc.nextInt();
        int windSpeed = sc.nextInt();

        System.out.println("airTemperature = " + airTemperature);
        System.out.println("airHumidity = " + airHumidity);
        System.out.println("windSpeed = " + windSpeed);

        sc.close();

        // TODO: Refactor variable names and print the results
    }
}