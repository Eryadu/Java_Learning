package UserInput;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for x");
        int x = scanner.nextInt();

        System.out.println("Enter the value of y");
        int y = scanner.nextInt();

        int sum = x+y;
        System.out.println("Sum of x and y is :"+ sum); */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name");
      // String name = scanner.next(); // this only print string and halt if found any space
       String name = scanner.nextLine(); // for printing first name and last name in string with space

       // char name = scanner.next().charAt(0);

        System.out.println(name);


    }
}
