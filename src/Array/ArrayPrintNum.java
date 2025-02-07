package Array;

import java.util.Scanner;

public class ArrayPrintNum {
    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the elements of array...");
        for ( int i=0; i< num.length;i++)
        {
            num[i]=scanner.nextInt();
        }
        for(int n : num)
        {
            System.out.println(n);
        }
    }
}
