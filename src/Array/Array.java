package Array;

import javax.sound.midi.Soundbank;
import javax.xml.bind.Element;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int[] name = new int[2];
        System.out.println("Enter the elements of Array ..");
        for (int i =0; i< name.length; i++)
        {
            name[i]=scanner.nextInt();
        }

        // enhanced for loop
        // for every integer element in the array, print that element
        for(int element : name) // enhanced method to print array .. you can take any variable in place of element i.e a,b,c
        {
            System.out.println(element);
        }
       /* for(int ie : name) // enhanced method to print array
        {
            System.out.println(ie);
        }
        */
   //     for (int i=0; i<name.length; i++) { // second methode to print array
   //         System.out.println(name[i]);
     //   }
    }
}
