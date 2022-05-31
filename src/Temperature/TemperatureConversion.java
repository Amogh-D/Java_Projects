package Temperature;

import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {
        System.out.println("~ Temperature Converter ~");
        System.out.println("(1) CurrencyConversion.Conversion from Celsius to Fahrenheit");
        System.out.println("(2) CurrencyConversion.Conversion from Fahrenheit to Celsius");
        System.out.println("(3) Exit");

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter your choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter temperature (in C): ");
                    float temperature = sc.nextFloat();
                    temperature = ((9 * temperature) / 5) + 32;
                    double tempRound = Math.round(temperature * 100.0) / 100.0;
                    System.out.println("Fahrenheit to Celsius: " + tempRound);
                    break;

                case 2:
                    System.out.println("Enter temperature (in F):");
                    float secondTemp = sc.nextFloat();
                    secondTemp = ((secondTemp - 32) * 5) / 9;
                    double secondTempRound = Math.round(secondTemp * 100.0) / 100.0;
                    System.out.println("Celsius to Fahrenheit: " + secondTempRound);
                    break;

                case 3:
                    System.out.println("\nExiting application.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. ");
            }
        }

    }

}