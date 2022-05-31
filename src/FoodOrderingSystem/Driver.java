package FoodOrderingSystem;
import java.util.Scanner;

public class Driver
{
    public static void main(String[] args) {
        ProductSystem system = new ProductSystem(5);
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        System.out.println("~ Food Management System ~");

        do {

            system.showMenu();

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter # of Products: ");
                    int size = sc.nextInt();sc.nextLine();

                    for (int i = 0; i < size; i++) {
                        System.out.println("Enter Product Name: ");
                        String name = sc.nextLine();

                        System.out.println("Enter Product Price: ");
                        double price = sc.nextDouble(); sc.nextLine();

                        system.addProduct(new Product(name, price));
                    }

                    System.out.println("Products successfully added.");
                    break;

                case 2:
                    system.viewProducts();
                    break;

                case 3:
                    System.out.println("Enter Search Term: ");
                    String name = sc.nextLine();

                    Product product = system.searchProduct(name);
                    System.out.println(product == null ?
                                    "No product found. " :
                                    product.toString()
                    );

                    break;

                case 4:
                    System.out.println("Enter Product to be Deleted: ");
                    String productName = sc.nextLine();

                    Product removedProduct = system.removeProduct(productName);
                    System.out.println(
                            removedProduct == null ?
                                    "No product found. " :
                                    removedProduct .toString()
                    );

                    break;

                case 5:
                    running = false;
                    break;

                default:
                    break;
            }
        } while (running);

        sc.close();
    }
}