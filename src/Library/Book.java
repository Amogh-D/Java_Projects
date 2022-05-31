package Library;



public class Book extends CatalogItem {
    private String author;
    private int ISBN;

    public Book(String title, double price, String author, int iSBN) {

        super(title, price);
        this.author = author;
        ISBN = iSBN;

    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {

        return "Book Title: " + getTitle() + " | Author: " + author + " | Price: " + getPrice() + " | ISBN: " + ISBN;

    }

}