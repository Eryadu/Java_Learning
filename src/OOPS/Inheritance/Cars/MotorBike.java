package OOPS.Inheritance.Cars;

import java.util.Scanner;

public class MotorBike extends Vehicle {
    String numOfSeats;

    public void seats()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of seats in Bike : ");
        numOfSeats = scanner.next();
    }
    public boolean bikeDetail()
    {
        return true;
    }

    @Override
    public void run() {
        System.out.println("Bike can run.");
    }

    @Override
    public void brake() {
        System.out.println("Bike can brake.");
    }

    @Override
    public void vehicleDetail() {
        System.out.println("Bike's details.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the color of bike : ");
        color= scanner.next();
        System.out.println("Enter the number of wheels in bike : ");
        numOfWheels = scanner.next();

    }

}
