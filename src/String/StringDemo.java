package String;

public class StringDemo {
    public static void main(String[] args) {
//        char[] ch = {'P', 'r','a', 'g', 'r', 'a'};
//
//        for (char ele : ch)
//        {
//            System.out.print(ele);
//        }

        String name = "Pragra"; // using literal
        name ="Mobile"; // immutable , first one (Pragra) remain in memory but reference will be deallocated from (Pragra)
                        // and located to new object (mobile)

        String companyname = new String("Microsoft"); // by using new keyword
    }
}
