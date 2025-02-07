package Array;

import java.util.Scanner;
import java.util.SortedMap;

public class ArrayMaxMethoMain {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of Array :");

        for (int i=0; i< arr.length;i++)
        {
            arr[i]= scanner.nextInt();
        }
        ArrayMaxMethod arrayMax = new ArrayMaxMethod(); // create instance of class ArrayMaxMethod
        int maxElement= arrayMax.findMaxElement(arr); // call method findMaxElement and pass max as array
                                                        // and store return value in maxElement

        System.out.println("Max is : " + maxElement);
    }

}
