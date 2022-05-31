package Library;

import java.util.ArrayList;

import java.util.Scanner;



public class Driver {



    public static ArrayList<Book> booklist = new ArrayList<>();

    public static ArrayList<DVD> listOfDVD = new ArrayList<>();

    public static void display()

    {

        for(int i=0;i<booklist.size();i++)

        {

            if(booklist.get(i) instanceof AudioBook)

                System.out.println((AudioBook)(booklist.get(i)));

            else

                System.out.println(booklist.get(i));

        }


        for(int i = 0; i< listOfDVD.size(); i++)

        {

            System.out.println(listOfDVD.get(i));

        }

    }

//method to find book

    public static boolean findBook(int isbn)

    {

        for(int i=0;i<booklist.size();i++)

        {

            if(booklist.get(i).getISBN() == isbn)

                return true;

        }

        return false;

    }

//method to find book

    public static boolean findDVD(int dvdcode)

    {

        for(int i = 0; i< listOfDVD.size(); i++)

        {

            if(listOfDVD.get(i).getDvdcode() == dvdcode)

                return true;

        }

        return false;

    }

    public static void main(String[] args) {

        System.out.println("Welcome to the Online Book Store");

        int option;
        String title;
        double price;
        String author;
        int isbn;
        double runningTime;
        String director;
        int year;
        int dvdcode;

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nEnter one of the following options: ");
            System.out.println("(1) Add Book");
            System.out.println("(2) Add Audio Book");
            System.out.println("(3) Add DVD");
            System.out.println("(4) Remove Book");
            System.out.println("(5) Remove DVD");
            System.out.println("(6) Display Catalog");
            System.out.println("(7) Exit Store");

            option = sc.nextInt();

            if(option == 1)

            {

                System.out.println("Enter Book ISBN #: ");

                isbn = sc.nextInt();

                if(findBook(isbn))

                    continue;

                System.out.println("Enter Book Title: ");

                title = sc.next();

                System.out.println("Enter Book Price: ");

                price = sc.nextDouble();

                while(price < 0) {

                    System.out.println("Invalid price, please try again. ");

                    price = sc.nextDouble();

                }

                System.out.println("Enter Book Author: ");

                author = sc.next();

                Book b = new Book(title, price, author, isbn);

                booklist.add(b);

            }

            else if(option == 2)

            {

                System.out.println("Enter Audio Book ISBN: ");

                isbn = sc.nextInt();

                if(findBook(isbn))

                    continue;

                System.out.println("Enter Audio Book Title: ");

                title = sc.next();

                System.out.println("Enter Audio Book Price: ");

                price = sc.nextDouble();

                while(price < 0) {

                    System.out.println("Invalid price, please try again. ");

                    price = sc.nextDouble();

                }

                System.out.println("Enter Audio Book Author: ");

                author = sc.next();

                System.out.println("Enter Audio Book Duration: ");

                runningTime = sc.nextDouble();

                while(runningTime < 0) {

                    System.out.println("Invalid time, please try again. ");

                    runningTime = sc.nextDouble();

                }

                AudioBook b = new AudioBook(title, price, author, isbn,runningTime);

                booklist.add(b);

            }

            else if(option == 3)

            {

                System.out.println("Enter DVD Code: ");

                dvdcode = sc.nextInt();

                if(findDVD(dvdcode))

                    continue;

                System.out.println("Enter DVD Title: ");

                title = sc.next();

                System.out.println("Enter DVD Price: ");

                price = sc.nextDouble();

                System.out.println("Enter DVD Director: ");

                director = sc.next();

                System.out.println("Enter DVD Year: ");

                year = sc.nextInt();

                DVD dvd = new DVD(title, price, director, year, dvdcode);

                listOfDVD.add(dvd);

            }

            else if(option == 4)

            {

                System.out.println("Enter ISBN # to Remove Book: ");

                isbn = sc.nextInt();

                boolean remove = false;

                for(int i = 0; i<booklist.size(); i++){

                    if(booklist.get(i).getISBN() == isbn){

                        booklist.remove(i);

                        remove = true;

                    }

                }

                if(remove == false)
                {
                    System.out.println("Invalid book selection.");
                }
                display();
            }

            else if(option == 5)
            {
                System.out.println("Enter DVD Code to Delete DVD: ");
                dvdcode = sc.nextInt();
                boolean remove = false;

                for(int i = 0; i < listOfDVD.size(); i++){
                    if(listOfDVD.get(i).getDvdcode() == dvdcode){
                        listOfDVD.remove(i);
                        remove = true;
                    }
                }
                if(remove == false)
                    System.out.println("Invalid DVD selection.");
                display();
            }

            else if(option == 6)
            {
                display();
            }

            else if (option == 7)
            {
                System.exit(0);
            }
            else
            {

                System.out.println("Invalid choice. ");
            }
        }
    }
}