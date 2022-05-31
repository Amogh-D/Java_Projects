package FoodOrderingSystem;
import java.util.Arrays;

public class ProductSystem {
    private Product[] products;
    private int capacity;
    private int size;

    public ProductSystem(int capacity) {
        this.capacity = capacity;
        size = 0;
        products = new Product[capacity];
        Arrays.fill(products, null);
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private void growSize() {
        Product[] temp = null;

        if (size == capacity) {
            temp = new Product[capacity * 2];

            for (int i = 0; i < capacity; i++)
                temp[i] = products[i];
        }

        products = temp;
        capacity *= 2;
    }

    public void addProduct(Product product) {
        if (size == capacity)
            growSize();

        products[size++] = product;
    }

    public Product removeProduct(String name) {
        if (size < 0)
            return null;

        --size;
        Product removedProduct = null;

        for (int i = 0; i < products.length; i++)
            if (name.equalsIgnoreCase(products[i].getName())) {
                removedProduct = products[i];
                products[i] = null;
                break;
            }

        return removedProduct;
    }

    public void viewProducts() {
        if (size == 0) {
            System.out.println("No products are available.");
            return;
        }

        for (Product product : products)
            if (product != null)
                System.out.println(product.toString());
    }

    public Product searchProduct(String name) {
        for (Product product : products)
            if (product != null && name.equalsIgnoreCase(product.getName()))
                return product;

        return null;
    }

    public void showMenu() {

        System.out.println("\nEnter one of the following options: ");
        System.out.println("(1) Add Products");
        System.out.println("(2) View All Products");
        System.out.println("(3) Search for Product");
        System.out.println("(4) Delete Product.");
        System.out.println("(5) Exit\n");
    }
}