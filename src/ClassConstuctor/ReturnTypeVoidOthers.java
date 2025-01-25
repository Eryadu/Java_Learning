package ClassConstuctor;

public class ReturnTypeVoidOthers {
    public static void main(String[] args)
    {
        // in void type --  it print the value as it, we can't use the output anywhere.
        //  Object
        // Classname ref = new Classname();


        ReturnTypeVoidOthers test = new ReturnTypeVoidOthers();
        test.sum(); // calling the method

        int multiple = test.multi();
        
        if (multiple > 100)
        {
            System.out.println("Something.....");
        }

    }
        public void sum()
        {
            int a = 10;
            int b = 12;
            int sum = a + b;
            System.out.println(sum);
        }
// for other return type like string -- we can use its output anywhere.
        public int multi ()
        {
            int a = 10;
            int b = 12;
            int multi = a * b;
            System.out.println(multi);
            return multi;
        }
    }