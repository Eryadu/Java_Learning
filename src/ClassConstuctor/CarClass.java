package ClassConstuctor;

import java.util.Scanner;

public class CarClass{

        // attributes
        // member variables

        String brand;
        int year;
        int numberofWheels;
        double price;

        // Behaviour
        // functionality  - methods
        // method -  set of block of elements .. which perform some specific functions


        public int accelerate()
        {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the Year of car = ");
                year = scanner.nextInt();
            //System.out.println("Car is Running...");
                return year;
        }

        public void brake(){
                System.out.println("Brake is prefect");
        }
        public void start (){
                System.out.println("It start in Year 1990.");
        }

        /*

        Public - accesses by all, private - no one can access outside class
        access_modifier return_type name_of_method(){

        return type;
        }


         */
    }

