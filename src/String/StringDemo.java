package String;

public class StringDemo {
    public static void main(String[] args) {
//        char[] ch = {'P', 'r','a', 'g', 'r', 'a'};
//
//        for (char ele : ch)
//        {
//            System.out.print(ele);
//        }

//        String name = "Pragra"; // using literal
//        name = "Mobile"; // immutable , first one (Pragra) remain in memory but reference will be deallocated from (Pragra)
//        // and located to new object (mobile)
//
//        String companyname = new String("Microsoft"); // by using new keyword


        String s1= "Pragra";
        String s2 = "Pragra";

        String s3 = new String ("Pragra");

// == -------> check the reference
// .equals() ------> check the content

//        System.out.println(s1==s2); // compare reference ---- give True cause Literal create SCP
//        System.out.println(s1.equals(s2)); // compare contents
//        // give true result for both


        System.out.println(s1==s3); // it gives false as reference changed, literal create SCP and new keyword create new object outside.
        System.out.println(s1.equals(s3)); // it gives True, cause it check only content.
    }
}
