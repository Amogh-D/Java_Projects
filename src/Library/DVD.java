package Library;

public class DVD extends CatalogItem {



    private String director;

    private int year;

    private int dvdcode;

    public DVD(String title, double price, String director, int year, int dvdcode) {

        super(title, price);

        this.director = director;

        this.year = year;

        this.dvdcode = dvdcode;

    }

    public String getDirector() {

        return director;

    }

    public int getYear() {

        return year;

    }

    public int getDvdcode() {

        return dvdcode;

    }

    @Override

    public String toString() {

        return "DVD Title: " + getTitle() + " | Director: "+ director + " | Price: " + getPrice() + " | Year: "+year + " | DvdCode: "+dvdcode;

    }

}