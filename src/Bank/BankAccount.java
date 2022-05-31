package Bank;

import java.io.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BankAccount {
    float balance;
    float previousTransaction;
    String customerName;
    String customerId;

    public BankAccount(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public void deposit(float amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    public void withdraw(float amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    public void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + previousTransaction);
        } else {
            System.out.println("No transaction occurred.");
        }
    }

    public void displayMenu() throws IOException {
        Object sessionID = Math.round(Math.random() * 100000);
        System.out.println("Welcome " + customerName.toUpperCase() + "! Your session ID is " + sessionID + "\n");
        System.out.println("1. Check Balance\n" +
                "2. Deposit\n" +
                "3. Withdraw\n" +
                "4. Previous Transaction\n" +
                "5. Transaction History\n" +
                "6. Exit\n" +
                "_________________________________________");

        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter an option: ");
            int n = Integer.parseInt(br.readLine());

            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String formattedDate = myDateObj.format(myFormatObj);


            if (n == 1) {
                System.out.println("Balance: " + balance);
                System.out.println("_________________________________________");

            } else if (n == 2) {
                System.out.print("Enter an amount to deposit:" + "\t");
                float depositAmount = Float.parseFloat(br.readLine());
                deposit(depositAmount);
                writeLog("Deposited: " + depositAmount + " on " + formattedDate);
                System.out.println("You deposited " + depositAmount + " into your account on " + formattedDate);
                System.out.println("_________________________________________");

            } else if (n == 3) {
                System.out.print("Enter an amount to withdraw:" + " ");
                float withdrawAmount = Float.parseFloat(br.readLine());
                withdraw(withdrawAmount);
                writeLog("Withdrew: " + withdrawAmount + " on " + formattedDate);
                System.out.println("You withdrew " + withdrawAmount + " into your account on " + formattedDate);
                System.out.println("_________________________________________");

            } else if (n == 4) {
                getPreviousTransaction();
                System.out.println("_________________________________________");

            } else if (n == 5){
                String string;
                File myFile = new File("BankSummary.txt");
                BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile));

                while ((string = bufferedReader.readLine()) != null)
                    System.out.println(string);

                System.out.println("_________________________________________");

            } else if (n == 6) {
                System.out.println("Here is your account summary: " +
                        "\n\nName: " + customerName.toUpperCase() + "\nSession ID: " + sessionID
                        + "\nTotal Balance: " + balance);

                System.out.println("\nThank you for your time.");
                FileWriter writer = new FileWriter("BankSummary.txt");
                System.out.println("_________________________________________");
                writer.flush();
                System.exit(0);


            } else {
                System.out.println("Invalid option, sorry");
                System.out.println("_________________________________________");

            }
        }
    }

    public void writeLog(String message){
        try {
            FileWriter writer = new FileWriter("BankSummary.txt",true);
            writer.write(message + "\n");
            writer.close();

        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
