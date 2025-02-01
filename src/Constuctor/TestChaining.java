package Constuctor;

public class TestChaining {

    String name;
    String emailId;
    String  salary;

    public TestChaining()
    {
        System.out.println("You are inside default constructor ...");
    }

    public TestChaining(String name) {
        this(); // calling default constructor
        System.out.println("You are inside 1 variable constructor ...");
        this.name = name;
        System.out.println(name);
    }

    public TestChaining(String name, String emailId)
    {
        this("ABC"); // calling 1 param const.
        System.out.println(" You are inside 2 variable param constructor ...");
        this.name = name;
        this.emailId = emailId;
        System.out.println(name);
        System.out.println(emailId);

    }
}
