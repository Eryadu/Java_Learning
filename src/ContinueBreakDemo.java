public class ContinueBreakDemo {
    public static void main(String[] args) {


        /*
        break;    -break out of the loop
        continue;  - skip the iteration


        1. print number 1-100
        skip the multiple of 5
        1 2 3 4 Pragra
        6 7 8 9 Pragra
         */
        int i=1;
        for (; i<=100;i++)
        {
            if(i%5==0)
            {
                System.out.println("Pragra");
                continue;
            }
                System.out.println(i);


        }

    }
}
