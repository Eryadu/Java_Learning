package Array;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {

        char[] ch = new char[] { 'A', 'D', 'B', 'F', 'Z','G'};
        System.out.println("Printed Array without Sorting : ");
        for (char c : ch)
        {
            System.out.println(c);
        }

        Arrays.sort(ch);
       // char[] ch2 = new char[] {'A', 'D', 'B', 'F', 'Z','G'};
        System.out.println("Array after Sorting : ");
        for ( char c :ch)
        {
            System.out.println(c);
        }
    }

}
