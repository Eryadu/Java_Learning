package Constuctor;

public class StudentChaining {
    String name;
    String age;
    String grade;
    String course;

    public StudentChaining() {
    }

    public StudentChaining(String name) {
        this("Const 3", "3", "3rd");
        this.name = name;
    }

    public StudentChaining(String name, String age) {
        this("Const 1");
        this.name = name;
        this.age = age;
    }

    public StudentChaining(String name, String age, String grade) {
        System.out.println(" Hello I am in Constructor 3...");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public StudentChaining(String name, String age, String grade, String course) {
        this("Const 2", "2");
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.course = course;
    }
}
