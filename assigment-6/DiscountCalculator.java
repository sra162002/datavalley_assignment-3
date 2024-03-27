import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        double totalExpenses;

        if (quantity > 50) {
            // 10% discount
            totalExpenses = quantity * pricePerItem * 0.9;
        } else if (quantity >= 25) {
            // 5% discount
            totalExpenses = quantity * pricePerItem * 0.95;
        } else {
            // No discount
            totalExpenses = quantity * pricePerItem;
        }

        System.out.println("Total expenses: $" + totalExpenses);

        scanner.close();
    }
}
