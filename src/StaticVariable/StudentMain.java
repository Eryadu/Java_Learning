package StaticVariable;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {
        int student_count; // global variable

    do {    // do-while loop to enter number of student and count all.
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the Student detail");

    System.out.println("Enter the Student name :");
    String student_name = scanner.nextLine();

    System.out.println("Enter the Student Class :");
    String student_class = scanner.nextLine();

    System.out.println("Enter the Student Roll_no :");
    int student_RollNo = scanner.nextInt();

    Student st = new Student(student_name, student_class, student_RollNo);
    System.out.println("Do you want to Enter new student or Exit ?");
    System.out.println("Enter 1 to Continue...");
    student_count = scanner.nextInt();
      }   while ( student_count ==1);


    }

}
