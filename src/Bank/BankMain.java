package Bank;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankMain {
    public static void main(String[] args) throws IOException {
        String Username;
        String Password;

        Password = "123";
        Username = "amogh";
        BankAccount amoghsBankAccount = new BankAccount(Username, Password);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("_________________________________________");
        System.out.println("Welcome to Banking Application! ");
        System.out.println("Log in using your credentials: \n");

        System.out.print("Enter your username: ");
        String usernameFromInput = br.readLine();

        System.out.print("Enter your password: ");
        String passwordFromInput = br.readLine();

        if ((usernameFromInput.toLowerCase().equals(Username)) && passwordFromInput.equals(Password)) {
            System.out.println("Access granted!");
            System.out.println("_________________________________________");
            amoghsBankAccount.displayMenu();
        } else if (usernameFromInput.equals(Username)) {
            System.out.println("Invalid Password!");
        } else if (passwordFromInput.equals(Password)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Invalid Username & Password!");
        }
    }
}
