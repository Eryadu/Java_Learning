package Constuctor;

public class DateMain {
    public static void main(String[] args) {

        DateDemo demo = new DateDemo(); // calling default const
        System.out.println(demo.day + "/" + demo.month + "/" + demo.year);

        DateDemo demo1 =new DateDemo(1,1,2025); // calling parametrized const
        System.out.println("New Year value :" + demo1.day + "/" + demo1.month + "/" + demo1.year);

        DateDemo demo2 = new DateDemo("Happy New Year");
        System.out.println(demo2.name);


    }
}
