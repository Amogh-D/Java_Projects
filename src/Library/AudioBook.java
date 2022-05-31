package Library;

public class AudioBook extends Book {



    private double runningTime;



    public AudioBook(String title, double price, String author, int iSBN, double runningTime) {

        super(title, price, author, iSBN);

        this.runningTime = runningTime;

    }



    public double getRunningTime() {

        return runningTime;

    }

    public double getP() {

        return getPrice()*0.90;

    }

    @Override

    public String toString() {

        return "Audio Book Title: " + getTitle() + " | Author: " + getAuthor() + " | Price: " + getP() + " | ISBN: "+getISBN() + " | running time: "+runningTime;

    }

}