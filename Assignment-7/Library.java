import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of days late: ");
        int daysLate = scanner.nextInt();
        double fine;
        
        if (daysLate <= 7) {
            fine = daysLate * 0.50;
            System.out.println("The fine is: Rs. " + fine);
        } else if (daysLate <= 14) {
            fine = 7 * 0.50 + (daysLate - 7);
            System.out.println("The fine is: Rs. " + fine);
        } else if (daysLate <= 21) {
            fine = 7 * 0.50 + 7 + (daysLate - 14) * 5;
            System.out.println("The fine is: Rs. " + fine);
        } else {
            System.out.println("Your membership has been canceled due to returning the book after 21 days.");
        }
        
        scanner.close();
    }
}