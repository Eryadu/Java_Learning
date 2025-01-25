package ClassConstuctor;

public class Main {
    public static void main(String[] args) {

        //We can call car class cause its in same package(ClassConstuctor).
        // If it in different package then we have to import it.

        CarClass car = new CarClass();
        car.brake();
       // car.accelerate();
        int CarYear = car.accelerate();
        {
            System.out.println("Car Year is = " + CarYear);
        }
        car.start();

    }
}
