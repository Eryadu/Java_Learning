package Constuctor;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {

        Book book = new Book();
        System.out.println("Default Constuctor : " + book.author + "/" + book.barcode + "/" + book.price + "/" + book.title);

        Book book1 = new Book("Single Value Constuctor : " + "The Java Learning");
        System.out.println(book1.title);

        Book book2 = new Book("Double value Constuctor " + "The Java Learning", "Shiv");
        System.out.println(book2.title + "/" + book2.author);

        Book book3 = new Book("Three value Constuctor : " + "The Java Learning", "Shiv", 100);
        System.out.println(book3.title + "/" + book3.author + "/" + book3.price);

        Book book4 = new Book("Four value Constuctor : " + "The Java Learning", "Shiv", 100,"1722882");
        System.out.println(book4.title + "/" + book4.author + "/" + book4.price + "/" + book4.barcode);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the detail of book : ");
        System.out.println(" The title of book is : ");
        String title = scanner.nextLine();
        System.out.println("Author Name : ");
        String  author = scanner.nextLine();
        System.out.println(" Barcode to scan : ");
        String barcode = scanner.nextLine();
        System.out.println("Price of Book : ");
        double price = scanner.nextDouble();


        Book book5 = new Book();
        book5.displayDetails(title,author,price,barcode);
    }
}
