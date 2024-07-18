import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        try {
            System.out.println("Account number: ");
            int clientAccountNumber = scanner.nextInt();

            System.out.println("Agency Number: ");
            String clientAccountAgency = scanner.next();

            System.out.println("Your first name: "); 
            String clientFirstName = scanner.next();

            System.out.println("Your last name: "); 
            String clientLastName = scanner.next();

            System.out.println("Enter the deposit amount: ");
            Float clientAccountBalance = scanner.nextFloat();

            System.out.println("Hello " + clientFirstName + " " + clientLastName + ", thank you for creating an account at our bank. " +
                "Your agency is " + clientAccountAgency + ", account " + clientAccountNumber + " and your balance " + clientAccountBalance + " is now available for withdrawal.");

        } catch (InputMismatchException error) {
            System.out.println("Invalid Input. Make sure all data has been entered correctly.");
        } finally {
            scanner.close();
        }
    }
}
