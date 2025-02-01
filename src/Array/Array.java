package Array;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int[] name = new int[10];
        System.out.println("Enter the elements of Array ..");
        for (int i =0; i< name.length; i++)
        {
            name[i]=scanner.nextInt();
        }
        for (int i=0; i<name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
