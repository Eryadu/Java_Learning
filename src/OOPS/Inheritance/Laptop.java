package OOPS.Inheritance;

public class Laptop extends Computer {

    @Override
    public void showDetail() {
        System.out.println("Inside the Laptop Class");
        System.out.println(capacity);
        System.out.println(model);
        System.out.println(manufacturer);
    }
}
