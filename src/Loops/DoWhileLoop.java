package Loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        // print the table of n (input number)
        // sum of n numbers

       int x=1;
       //int sum =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print the table of =  ");
        //System.out.println("Enter the range = ");
        int n = scanner.nextInt();

        do

            {
                System.out.println(n + "*" + x + "=" + (n*x));
                //sum +=x;
                //System.out.println(sum);
                x++;
            } while (x <= 10) ; //while(x<=n)
        //System.out.println("Sum of n numbers is = " + sum);
    }

    public static class IfElse {
        public static void main(String[] args) {

            int x=10;
           // String result = (x<5)? "Good day": "Good Evening";
            //System.out.println(result);
            // ternary operator
            System.out.println((x<6)? "Good day": "Good Evening");
        }
    }
}
