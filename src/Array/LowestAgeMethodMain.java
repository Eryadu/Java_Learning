package Array;

import java.util.Scanner;

public class LowestAgeMethodMain {
    public static void main(String[] args) {
        int[] ages = new int[4]; // declare array

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ages : ");

        for ( int i=0; i<ages.length; i++)
        {
            ages[i] = scanner.nextInt(); // enter the input
        }
//        for ( int i :ages)
//        {
//            ages[i]= scanner.nextInt();
//        }

        LowestAgeMethodDemo lw =  new LowestAgeMethodDemo(); // create instance of method
        int low1 = lw.lowestAge(ages); //call method and store return value
        System.out.println(" Lowest age is : " + low1);
    }
}
