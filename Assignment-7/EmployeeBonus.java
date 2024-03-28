import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get the current year and the year the employee joined
        System.out.print("Enter the current year: ");
        int currentYear = input.nextInt();
        System.out.print("Enter the year the employee joined: ");
        int joinYear = input.nextInt();
        
        // Calculate years of service
        int yearsOfService = currentYear - joinYear;
        
        // Determine the bonus based on years of service
        if (yearsOfService > 5) {
            System.out.println("The employee gets a bonus of Rs. 5000/-");
        } else if (yearsOfService >= 3) {
            System.out.println("The employee gets a bonus of Rs. 3000/-");
        } else {
            System.out.println("No bonus is awarded.");
        }
        
        input.close();
    }
}