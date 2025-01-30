package Constuctor;

public class DateDemo {

    int day; // default const
    int month;
    int year;
    String name;


public DateDemo() {

    int day = 14; // parameterized const
    int month = 12;
    int year = 2025;
  }

    public DateDemo(String name) {
        this.name = name;
    }

    public DateDemo (int day, int month, int year){

    this.day =day; // assign the value to default const. to recognize which is default, use this.day.
      this.month =month;
      this.year =year;

  }
}
