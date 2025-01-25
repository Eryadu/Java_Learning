package Assigment.readme;

import java.util.Scanner;

public class IvrSystem {
    public static void main(String[] args) {

        System.out.println("**************************");
        System.out.println("Welcome to IVR system");
        System.out.println("**************************");

        System.out.println("Choose your language");
        System.out.println("1. English");
        System.out.println(("2. French"));
        System.out.println("3. Exit the system");

        System.out.println("Enter your choice");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Choose the Option ");
                System.out.println("1. Internet-E");
                System.out.println("2. Mobile service-E");
                System.out.println("3. Technical support-E");
                System.out.println("4. Sales-E");
                System.out.println("5. Customer Service-E");

                Scanner scanner1 = new Scanner(System.in);
                int choice1 = scanner1.nextInt();
                {
                switch (choice1) {
                    case 1:
                        System.out.println("Welcome to Internet-E");
                        break;
                    case 2:
                        System.out.println("Welcome to Mobile service-E");
                        break;
                    case 3:
                        System.out.println("Welcome to Technical support-E");
                        break;
                    case 4:
                        System.out.println("Welcome to sales-E");
                        break;
                    case 5:
                        System.out.println("Welcome to Customer Service-E");
                        break;
                    default:
                        System.out.println("Wrong option-E");
                        System.exit(0);
                }
                System.exit(0);
                }

            case 2:
                System.out.println("Choose the option ");
                System.out.println("1. Internet-F");
                System.out.println("2. Mobile service-F");
                System.out.println("3. Technical support-F");
                System.out.println("4. Sales-F");
                System.out.println("5. Customer Service-F");

                Scanner scanner2 = new Scanner(System.in);
                int choice2 = scanner2.nextInt();
            {
                switch (choice2) {
                    case 1:
                        System.out.println("Welcome to Internet-F");
                        break;
                    case 2:
                        System.out.println("Welcome to Mobile service-F");
                        break;
                    case 3:
                        System.out.println("Welcome to Technical support-F");
                        break;
                    case 4:
                        System.out.println("Welcome to sales-F");
                        break;
                    case 5:
                        System.out.println("Welcome to Customer Service-F");
                        break;
                    default:
                        System.out.println("Wrong option-F");
                        System.exit(0);
                }
                        System.exit(0);
                }

            case 3:
                System.out.println("Thank you for your call");
                System.exit(0);

           default:
                System.out.println("Wrong choice");
                System.exit(0);

        }
    }
}
