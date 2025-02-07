package Array;

import java.util.Scanner;

public class MaxMinArrayMain {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of Array :");

        for (int i=0; i< arr.length;i++)
        {
            arr[i]= scanner.nextInt();
        }
        MaxMinArray arrayMax = new MaxMinArray(); // create instance of class ArrayMaxMethod
        int maxElement= arrayMax.findMaxElement(arr); // call method findMaxElement and pass max as array
                                                        // and store return value in maxElement
        System.out.println("Max is : " + maxElement);
        int minElement= arrayMax.findMinElement(arr);
        System.out.println("Min is : " + minElement);
    }

}
