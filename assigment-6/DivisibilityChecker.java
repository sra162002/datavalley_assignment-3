import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        boolean divisibleBy7 = number % 7 == 0;
        boolean divisibleBy13 = number % 13 == 0;

        if (divisibleBy7 && divisibleBy13) {
            long quotient7 = number / 7;
            long remainder7 = number % 7;
            long quotient13 = number / 13;
            long remainder13 = number % 13;

            System.out.println(number + " is divisible by both 7 and 13.");
            System.out.println("Quotient when divided by 7: " + quotient7);
            System.out.println("Remainder when divided by 7: " + remainder7);
            System.out.println("Quotient when divided by 13: " + quotient13);
            System.out.println("Remainder when divided by 13: " + remainder13);
        } else {
            System.out.println(number + " is not divisible by both 7 and 13.");
        }

        scanner.close();
    }
}
