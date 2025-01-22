import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of item 1: ");
        String item1Name = scanner.nextLine();
        System.out.print("Enter the price of item 1: ");
        double item1Price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter the name of item 2: ");
        String item2Name = scanner.nextLine();
        System.out.print("Enter the price of item 2: ");
        double item2Price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter the name of item 3: ");
        String item3Name = scanner.nextLine();
        System.out.print("Enter the price of item 3: ");
        double item3Price = scanner.nextDouble();
        double totalCost = item1Price + item2Price + item3Price;
        System.out.printf("Item 1: %s - $%.2f%n", item1Name, item1Price);
        System.out.printf("Item 2: %s - $%.2f%n", item2Name, item2Price);
        System.out.printf("Item 3: %s - $%.2f%n", item3Name, item3Price);
        System.out.printf("Total: $%.2f%n", totalCost);

    }
}