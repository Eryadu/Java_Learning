package ClassConstuctor;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //We can call car class cause its in same package(ClassConstuctor).
        // If it in different package then we have to import it.

      /*  CarClass car = new CarClass();
        car.brake();
       // car.accelerate();
        int CarYear = car.accelerate();
        {
            System.out.println("Car Year is = " + CarYear);
        }
        car.start();

       */
        MethodWithArguments myName1 = new MethodWithArguments();

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your name : ");
        String userEnteredName = scanner.nextLine();


      String my = myName1.greeting (userEnteredName);
        System.out.println(my);


    }

}
