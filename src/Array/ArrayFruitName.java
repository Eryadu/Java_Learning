package Array;

import java.util.Scanner;

public class ArrayFruitName {
    public static void main(String[] args) {
//         String[] fruit = new String[5];
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the name of fruits ..");
//
//        for (int i=0; i< fruit.length;i++)
//        {
//            fruit[i]=scanner.nextLine();
//        }
//         for ( String f :fruit)
//         {
//             System.out.println(f);
//         }

        String[] NorthCountries = new  String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<NorthCountries.length;i++)
        {
            NorthCountries[i]=scanner.nextLine();
        }
        for ( String NC : NorthCountries)
        {
            System.out.println(NC);
        }
    }
}
