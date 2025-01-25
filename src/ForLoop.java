import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        int factorial =1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int fact = scanner.nextInt();

        for ( int i =fact; i>=1; i--)
        {
            factorial= factorial *i;
        }
        System.out.println(factorial);
    }
}


/*
interview question

infinite loop

for (; ;)
{
System.out.println("Hello");
}
 */