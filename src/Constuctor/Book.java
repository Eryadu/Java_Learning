package Constuctor;

public class Book {
    String title ;
    String  author;
    double price;
    String barcode;

    // create constructor,
    // 1 parameters, 2,3,4,, default const
    // complete the methode displayDetails - add parameters
    // and with the help of object Book class, call all the method.

   public void displayDetails( String title, String author, double price, String barcode){
       System.out.println(title + " " + author + " " + price + " " + barcode);
    }


    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String title, String author, double price, String barcode) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.barcode = barcode;
    }

    public Book() {

    }
}
