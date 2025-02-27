package OOPS.Inheritance.Cars;

import java.util.Scanner;

public class Aeroplane extends Vehicle {
    String company;

    @Override
    public void vehicleDetail() {
        System.out.println("Aeroplane Detail.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Aeroplane color : ");
        color = scanner.next();
        System.out.println("Enter the number of wheel of Aeroplane : ");
        numOfWheels = scanner.next();
    }

    @Override
    public void brake() {
        System.out.println("Aeroplane can brake.");
    }

    @Override
    public void run() {
        System.out.println("Aeroplane can run.");
    }

    public void companyAir()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the company of Aeroplane : ");
        company = scanner.next();
    }

    public boolean airDetail()
    {
        return true;
    }
}
