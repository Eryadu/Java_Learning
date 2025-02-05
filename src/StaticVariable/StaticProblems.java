package StaticVariable;

class StaticProblems
{
    final static short i = 2;
    public static int j = 0;

    public static void main(String [] args)
    {
        for (int k = 0; k < 3; k++)
        {
            switch (k)
            {
                case i: System.out.print(" 0 ");
                case i-1: System.out.print(" 1 ");
                case i-2: System.out.print(" 2 ");
            }
        }
    }
}

// output 212012


/*public class Main {
    int a = 50;
    int b = 10;
    public static void main(String args[]) {
        a += b--; // non-static variable inside the static method, which is not allowed, so it gives an error.
        System.out.println(a);
    }
}
//output : compile time error
 */