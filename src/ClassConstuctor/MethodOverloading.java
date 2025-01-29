package ClassConstuctor;

import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        MainOverloading  person = new MainOverloading ();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        person.info(name);

        System.out.println("Enter the name and Email : ");
        String email = scanner.nextLine();
        person.info(name, email);

        System.out.println("Enter the name and email and phone");
        int phone = scanner.nextInt();
        person.info(name, email, phone);

    }
}
