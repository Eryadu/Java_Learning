public class FactorialRecusion {
    public static void main(String[] args) {
        int result = fact(5);
        System.out.println("Factorial is :" + result);
    }

    public static int fact(int i)
    {
        if(i==1) {
            return 1;
        }
            int output;
            output = i* fact(i-1);
            return output;

    }
}
