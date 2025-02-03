package machine;

import static machine.CoffeeMachine.scanner;

public class Main {
    private CoffeeMachine machine; // Declare machine as an instance variable

    public static void main(String[] args) {
        Main main = new Main(); // Create an instance of Main
        main.start(); // Start the program
    }

    // Constructor to initialize the CoffeeMachine
    public Main() {
        this.machine = new CoffeeMachine();
    }

    public void start() {
        while (true) {
            displayMenu();
            String input = scanner.nextLine();
            handleMenuChoice(input);
        }
    }

    public void displayMenu() {
        System.out.println("\nWrite action (buy, fill, take, clean, remaining, exit): ");
    }

    public void handleMenuChoice(String input) {
        switch (input) {
            case "buy":
                machine.buyCoffee();
                break;
            case "fill":
                machine.fillCoffee();
                break;
            case "take":
                machine.takeMoney();
                break;
//            case "clean":
//                machine.cleanMachine();
//                break;
            case "remaining":
                machine.displayState();
                break;
            case "exit":
                System.exit(0); // Exit the program
                break;
            default:
                System.out.println("Invalid action. Please try again.");
                break;
        }
    }
}