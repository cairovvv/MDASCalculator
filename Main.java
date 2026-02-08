import java.util.Scanner;

public class MainCalcu {

    public static void main(String [] args){

        boolean continueCalc = true;
        int choice;
        Scanner scan = new Scanner(System.in);


       while (continueCalc) {
            System.out.println("=== Welcome to MDAS Calculator !! ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Pick a number: ");
            choice = scan.nextInt();

            if (choice >= 5) {
                continueCalc = false;
                System.out.println("\n !! Thank you for using the calculator !!\n");
                break;
            }
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice. Please try again!\n");
                continue;
            }

            System.out.print("Enter your first number: ");
            int num1 = scan.nextInt();

            System.out.print("Enter your second number: ");
            int num2 = scan.nextInt();

            int result;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Sum: " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Difference: " + result);
                    break;    
                
                case 3:
                    result = num1 * num2;
                    System.out.println("Product: " + result);
                    break;

                case 4:
                    result = num1 / num2;
                    System.out.println("Quotient: " + result);
                    break;

            }
        }
        scan.close();
    }
}