package Array;

import java.util.Scanner;

public class SwapingNum {
    public static void main(String[] args) {

        int[] swap = new int[8];
        int frst = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the numbers to swap . . .");
        for (int i = 0; i < swap.length; i++) {
            swap[i] = scanner.nextInt();
        }
        int len = swap.length; // calculate the length of array
        for (int i=0; i< len;i++)// swap the elements of array
        {
                frst = swap[i];
                swap[i] = swap[len-1];
                swap[len-1] = frst;
                len--;
        }
        System.out.println("Swapping numbers are : " );
        for (int e:swap) //  enhanched loop to print reversed array
        {
            System.out.println( e);
        }
    }
}
