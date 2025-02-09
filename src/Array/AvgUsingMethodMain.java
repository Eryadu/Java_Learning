package Array;

import java.util.Scanner;


public class AvgUsingMethodMain {
    public static void main(String[] args) {
        int[] ages = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of Array :");

        for (int i=0; i< ages.length;i++) {
            ages[i] = scanner.nextInt();
        }
        AvgUsingMethodDemo av =new AvgUsingMethodDemo(); // created instance of method
        float avg = av.avrage(ages); // store return value
        System.out.println(" Average is =" + avg );
    }
}
