package UserInput;

import java.util.Scanner;

public class CalculatorDoWhileSwitch {
    public static void main(String[] args) {

        System.out.println("****************************");
        System.out.println("Welcome to My Calculator");

        char input2;
        do {

            System.out.println("1.Addition");
            System.out.println(("2.Subtraction"));
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Modulus");
            System.out.println("6.Exit");

            System.out.println("Enter your choice : ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

              switch (choice)
               {

                case 1:
                    char input;
                    do {
                        System.out.println("Enter the value of x : ");
                        float x = scanner.nextFloat();
                        System.out.println("Enter the value of y : ");
                        float y = scanner.nextFloat();
                        float sum = x + y;
                        System.out.println("Sum of two numbers = " + sum);
                        System.out.println("Do you still want to add more numbers?");
                        System.out.println("Press Y for Yes, N for No.");
                        input = scanner.next().charAt(0);
                      } while (input == 'Y' || input == 'y');
                        break;

                  case 2:
                      do {
                          System.out.println("Enter the value of x : ");
                          float x = scanner.nextFloat();
                          System.out.println("Enter the value of y : ");
                          float y = scanner.nextFloat();
                          float sub = x - y;
                          System.out.println("Subtraction of two numbers = " + sub);
                          System.out.println("Do you still want to subtract more numbers?");
                          System.out.println("Press Y for Yes, N for No.");
                          input = scanner.next().charAt(0);
                      } while (input == 'Y' || input == 'y');
                      break;

                      case 3:
                          do {
                          System.out.println("Enter the value of x");
                          float x = scanner.nextFloat();
                          System.out.println("Enter the value of y");
                          float y = scanner.nextFloat();
                          float mul = x*y;
                          System.out.println("Multiplication of two numbers = " + mul);
                          System.out.println("Do you still want to multiply more numbers?");
                          System.out.println("Press Y for Yes and N for No");
                          input = scanner.next().charAt(0);
                          }while(input == 'Y'  || input == 'y');
                          break;
                   case 4:
                       do {
                           System.out.println("Enter the value of x");
                           float x = scanner.nextFloat();
                           System.out.println("Enter the value of y");
                           float y = scanner.nextFloat();
                           float div = x/y;
                           System.out.println("Divisons of two numbers = " + div);
                           System.out.println("Do you still want to divions more numbers?");
                           System.out.println("Press Y for Yes and N for No");
                           input = scanner.next().charAt(0);
                       }while(input == 'Y'  || input == 'y');
                       break;
                   case 5:
                       do {
                           System.out.println("Enter the value of x");
                           float x = scanner.nextFloat();
                           System.out.println("Enter the value of y");
                           float y = scanner.nextFloat();
                           float mod = x%y;
                           System.out.println("Modulus of two numbers = " + mod);
                           System.out.println("Do you still want to modulus of more numbers?");
                           System.out.println("Press Y for Yes and N for No");
                           input = scanner.next().charAt(0);
                       }while(input == 'Y'  || input == 'y');
                       break;
                   case 6:
                       System.exit(0);
                   default:
                       System.out.println("Invalid input.");
              }
                System.out.println("Do you want to go back to main menu?");
                System.out.println("Press Y for Yes, N for No.");
                input2 = scanner.next().charAt(0);
            }
            while (input2 == 'Y' || input2 == 'y') ;

        }
    }

