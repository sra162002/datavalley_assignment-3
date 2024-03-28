import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Convert the string to lower case to make the program case-insensitive
        inputString = inputString.toLowerCase();
        
        // Define vowels
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int vowelCount = 0;
        
        // Check each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            for (char vowel : vowels) {
                if (ch == vowel) {
                    vowelCount++;
                    break; // Break the inner loop if a vowel is found
                }
            }
        }
        
        // Display the result
        if (vowelCount > 0) {
            System.out.println("Vowels are present in the string.");
            System.out.println("Total number of vowels: " + vowelCount);
        } else {
            System.out.println("No vowels are present in the string.");
        }
        
        scanner.close();
    }
}