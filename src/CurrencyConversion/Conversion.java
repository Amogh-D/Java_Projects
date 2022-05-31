package CurrencyConversion;

import java.util.Scanner;

public class Conversion{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double total;
        int num = 0;
        char ch;

        System.out.println("~ Currency CurrencyConversion.Conversion Calculator (USD)~\n");

        System.out.println("(1) Canadian Dollar");
        System.out.println("(2) Chinese Yuan");
        System.out.println("(3) European Euro");
        System.out.println("(4) Indian Rupee");
        System.out.println("(5) Mexican Peso");
        System.out.println("(6) Russian Ruble");
        System.out.println("(7) Swedish Krona");
        System.out.println("(8) British Pound");

        do {
            System.out.println("\nSelect Desired Currency: ");
            num = sc.nextInt();
            System.out.println("Enter Amount of US Dollars: ");

            double dollar = sc.nextDouble();

            if (num == 1) {
                total = 1.27 * dollar;
                double totalRound = Math.round(total * 100.0) / 100.0;
                System.out.println("Total Amount: " + totalRound + " Canadian Dollars");

            } else if (num == 2) {
                total = 6.47 * dollar;
                double totalRound = Math.round(total * 100.0) / 100.0;
                System.out.println("Total Amount: " + totalRound + " Chinese Yuans");

            } else if (num == 3) {
                total = 0.83 * dollar;
                double totalRound = Math.round(total * 100.0) / 100.0;
                System.out.println("Total Amount: " + totalRound + " European Euros");

            } else if (num == 4) {
                total = 73.28 * dollar;
                double totalRound = Math.round(total * 100.0) / 100.0;
                System.out.println("Total Amount: " + totalRound + " Indian Rupees");

            } else if (num == 5) {
                total = 20.65 * dollar;
                double totalRound = Math.round(total * 100.0) / 100.0;
                System.out.println("Total Amount: " + totalRound + " Mexican Pesos");

            } else if (num == 6) {
                total = 74.20 * dollar;
                double totalRound = Math.round(total * 100.0) / 100.0;
                System.out.println("Total Amount: " + totalRound + " Russian Rubles");

            } else if (num == 7) {
                total = 8.44 * dollar;
                double totalRound = Math.round(total * 100.0) / 100.0;
                System.out.println("Total Amount: " + totalRound + " Swedish Kronas");

            } else if (num == 8) {
                total = 0.72 * dollar;
                double totalRound = Math.round(total * 100.0) / 100.0;
                System.out.println("Total Amount: " + totalRound + " British Pounds");
            }
            else
            {
                System.out.println("Invalid Option.");
            }

            System.out.println("\nAnother Currency Conversion? (y/n) ");
            ch = sc.next().charAt(0);
        } while (ch == 'y');
    }
}