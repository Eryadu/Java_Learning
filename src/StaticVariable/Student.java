package StaticVariable;

public class Student {

    String student_Name ;
    String student_Class;
    int student_RollNo;

    static int student_counter; // static variable

    public Student(String student_Name, String student_Class, int student_RollNo) {
        this.student_Name = student_Name;
        this.student_Class = student_Class;
        this.student_RollNo = student_RollNo;
       // this.student_counter= student_counter;

        System.out.println("Student Name : " + student_Name);
        System.out.println("Student Class : " + student_Class);
        System.out.println("Student RollNo : "+ student_RollNo);
        System.out.println("Student Counter : " + ++student_counter);
    }
}
