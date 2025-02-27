package OOPS.Inheritance.Cars;

public class VehicleMain {
    public static void main(String[] args) {

        Vehicle veh = new Vehicle();
        veh.vehicleDetail();
        System.out.println("Vehicle color : " + veh.color);
        System.out.println("Vehicle number of wheels : " + veh.numOfWheels);
        veh.run();
        veh.brake();

        MotorBike motorBike = new MotorBike();

        motorBike.vehicleDetail();
        motorBike.seats();
        System.out.println("Bike details is " + motorBike.bikeDetail());
        System.out.println("Motorbike number of seats : " + motorBike.numOfSeats);
        System.out.println("Motorbike color : " + motorBike.color);
        System.out.println("Motorbike number of wheels : " + motorBike.numOfWheels);

        motorBike.run();
        motorBike.brake();

        Aeroplane aeroplane = new Aeroplane();
        aeroplane.vehicleDetail();
        aeroplane.companyAir();
        System.out.println("Aeroplane detail is " + aeroplane.airDetail());
        System.out.println("Aeroplane company : " + aeroplane.company);
        System.out.println("Aeroplane color : " + aeroplane.color);
        System.out.println("Aeroplane number of wheels : " + aeroplane.numOfWheels);

        aeroplane.brake();
        aeroplane.run();




    }
}
