package TaxiBooking;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TaxiBooking> list = new ArrayList<>();
        ArrayList<Customer> listCustomer = new ArrayList<>();
        System.out.println("| Taxi Booking Page | ");
        System.out.println("_____________________\n");

        String empty = " ";
        do {
            System.out.println("Enter Customer Name:");
            String customerName = scanner.next();
            System.out.println("Enter Phone Number:");
            String phone = scanner.next();
            System.out.println("Enter Pickup Address:");
            String address = scanner.next();
            System.out.println("Enter Booking Amount: ");
            int amount = scanner.nextInt();
            for(int i=0; i < amount; i++) {
                System.out.println("Enter Booking ID: ");
                int id = scanner.nextInt();
                System.out.println("Enter Total Distance: ");
                int kilometers = scanner.nextInt();
                TaxiBooking taxiBooking = new TaxiBooking(id, kilometers);
                list.add(taxiBooking);
            }
            System.out.println("Continue? (y/n)");
            empty = scanner.next();
            Customer customer = new Customer(customerName, phone, address);
            customer.setList(list);
            listCustomer.add(customer);
        }while(empty.equalsIgnoreCase("Y"));

        System.out.println("\nTaxi Booking Details:\n");
        for(Customer customer:listCustomer) {
            System.out.println(customer);
        }
    }

}