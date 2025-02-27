package OOPS.Inheritance.Cars;

import java.util.Scanner;

public class Vehicle {
    String numOfWheels ;
    String color;

    public void vehicleDetail()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of wheels : ");
        numOfWheels = scanner.next();
        System.out.println("Enter the color of Vehicle ");
        color = scanner.next();
        System.out.println("Vehicle Detail is : " );

    }

    public void run()
    {
        System.out.println("Vehicle can run");
    }

    public  void brake()
    {
        System.out.println("Vehicle can brake");
    }

}
