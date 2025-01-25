package Loops;

public class ForLoop {
    public static void main(String[] args) {
        // for loop
        // nested for loop
        // for- each loop

     /*   for (int i=1; i<=10;i++)
        {
            System.out.println(i);
        }

        for (int i = 1; i <= 2; i++) {
            //System.out.println("Outer" + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + "," + j+ "");
            }
        }

       // int[] numbers ={1,2,3,4};
        String[] name ={"Ya","Pa","Ma","Gu"};
        //for (int i : numbers)
        for(String na : name)
        {
            //System.out.println(i);
            System.out.println(na);
        }
*/

        // Table of 2

        int number =2;
        for(int i=1;i<=10;i++)
        {
            System.out.println(number + "x" + i + "=" +(number * i));
        }
    }
}
