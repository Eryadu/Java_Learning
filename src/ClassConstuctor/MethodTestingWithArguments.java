package ClassConstuctor;

import java.util.Scanner;

public class MethodTestingWithArguments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values of parameters");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        Sum (x1,y1); // Arguments
    }

    static void Sum(int x, int y){// parameters

        int z = x+y;
        System.out.println("Sum of Numbers " + z);
    }

}
