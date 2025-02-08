package Array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] rev = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array to reverse . . .");
        for (int i=0;i< rev.length;i++) { // input the array
            rev[i] = scanner.nextInt();
        }
        System.out.println("Reversed array is . . " );
        for (int i=4;i< rev.length;i--) { // reverse the input
            System.out.println(rev[i]);
        }
    }

}
