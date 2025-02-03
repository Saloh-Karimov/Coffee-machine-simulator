package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static final Scanner scanner = new Scanner(System.in);
    private int water = 400, milk = 540, coffeeBeans = 120;
    private int cups = 9, money = 550;

    // Display method to display the resources. Instance, no parameters
    public void displayState() {
        System.out.printf("The coffee machine has:\n%d ml of water\n%d ml of milk\n", water, milk);
        System.out.printf("%d g of coffee beans\n%d disposable cups\n$%d of money\n", coffeeBeans, cups, money);
    }

    public void buyCoffee() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String input = scanner.nextLine();
        int choice = input.equals("back") ? 0 : Integer.parseInt(input);

        int waterNeeded = 0, milkNeeded = 0, beansNeeded = 0, cost = 0;
        switch (choice) {
            case 1:
                waterNeeded = 250;
                beansNeeded = 16;
                cost = 4;
                break;
            case 2:
                waterNeeded = 350;
                milkNeeded = 75;
                beansNeeded = 20;
                cost =7;
                break;
            case 3:
                waterNeeded = 200;
                milkNeeded = 100;
                beansNeeded = 12;
                cost = 6;
                break;
            case 0:
                return;
            default:
                System.out.println("Error");
                break;
        }
        calculateResources(waterNeeded, milkNeeded, beansNeeded, cost);
    }
    public void calculateResources(int waterNeeded, int milkNeeded, int beansNeeded, int cost) {
        if (water >= waterNeeded && coffeeBeans >= beansNeeded && milk >= milkNeeded && cups > 0) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= waterNeeded;
            milk -= milkNeeded;
            coffeeBeans -= beansNeeded;
            money += cost;
            cups--;
            return;
        }
        if (water < waterNeeded) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < milkNeeded) {
            System.out.println("Sorry, not enough milk!");
        } else if (coffeeBeans < beansNeeded) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cups == 0) {
            System.out.println("Sorry, not enough disposable cups!");
        }
    }

    public void fillCoffee() {
        System.out.println("Write how many ml of water you want to add: ");
        water += Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many ml of milk you want to add: ");
        milk += Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many grams of coffee beans you want to add: ");
        coffeeBeans += Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many disposable cups you want to add: ");
        cups += Integer.parseInt(scanner.nextLine());
    }

    public void takeMoney() {
        System.out.println("I gave you $" + money);
        money = 0;
    }
}