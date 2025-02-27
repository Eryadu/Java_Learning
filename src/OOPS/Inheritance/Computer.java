package OOPS.Inheritance;

public class Computer {


        int capacity;
        String model;
        String manufacturer;

    public Computer() {
    }

    public Computer(int capacity, String model, String manufacturer) {
        this.capacity = capacity;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public void showDetail(){
        System.out.println("Inside the Computer class.");
    }
}
