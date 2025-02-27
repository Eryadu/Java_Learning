package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {

       /* Computer computer = new Computer();
        computer.showDetail();*/

        Laptop laptop = new Laptop();
        laptop.showDetail();
        System.out.println(laptop.capacity);
        System.out.println(laptop.model);
        System.out.println(laptop.manufacturer);


    }
}
