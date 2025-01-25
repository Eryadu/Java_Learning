package Loops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        /*

        //Loops

        1. while
        2. Do-While
        3.For loop
        4. for each loop / enhanced for loop [Arrays]
         */


       /* while (x<=10) {

            System.out.println("Hello");
            x++;
        int x =1;
        do {
            System.out.println("Hi I am Here.");
            x++;
        }
        while
        (x<=5);

        int dice = 1;

        while(dice<=6)
        {
            if(dice<6)
            {
                System.out.println("No Yatzy");
            }
            else {
                System.out.println("Yatzt");
            }
            dice = dice+1;
        }


        int countdown =3;
        while(countdown>0)
        {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy new Year");


        */
  /*
        1. Table of 5
        2. Print number from 1-10
        3. Print number from 1-n
        enter the value of n
        4. sum of 1-10
        or 1-n

         */
       /* int x=1;
        int y =5;

        while(x<=10)
        {
            System.out.println("5" + "*" +x + "=" + (5*x));
            x++;

        }

        */

        int x=1;

     /*   while (x<=10)
        {
            System.out.println(x);
            x++;
        }


      */
        int sum =0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n = ");
        int  n = scanner.nextInt();

        while (x<=n)
        {
            sum += x;
            //System.out.println(sum);
            x++;
        }
        System.out.println("Sum of number = " + sum);

    }
}
