package Calculator;

import java.util.Scanner;

public class SimpleCalculator {

    private static Scanner scanner;

    public static void main(String[] args) {
        while (true)
        {
            scanner = new Scanner(System.in);
            System.out.println("Select from the following choices\n");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Power");
            System.out.println("6: Modulo");
            System.out.println("0: EXIT\n");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();


            if (choice >= 1 && choice <= 6) {
                System.out.println("Enter the first number:");
                double operand1 = scanner.nextInt();
                System.out.println("Enter the second number:");
                double operand2 = scanner.nextInt();
                double output = 0;

                switch (choice) {
                    case 1:
                        output = operand1 + operand2;
                        break;

                    case 2:
                        output = operand1 - operand2;
                        break;

                    case 3:
                        output = operand1 * operand2;
                        break;

                    case 4:
                        output = operand1 / operand2;
                        break;

                    case 5:
                        output = Math.pow(operand1, operand2);
                        break;

                    case 6:
                        output = operand1 % operand2;
                        break;

                }

                System.out.println("Output result: " + output + "\n");
            } else {
                if (choice == 0) {
                    System.exit(0);
                } else {
                    System.out.println("Invalid choice, please try again. \n");
                }
            }
        }
    }
}