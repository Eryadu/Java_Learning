package StaticVariable;
// If any class instance modifies a static variable's value, the change is reflected across all class instances.
public class StaticPractice {
    static int countryCounter; // static variable
    String name;
    int dummyCounter;

    public static void main(String[] args) {
        StaticPractice st1 = new StaticPractice(); // creating first instance
        st1.name ="Ya";
        st1.dummyCounter=1;

        ++st1.countryCounter;

        StaticPractice st2 = new StaticPractice(); // creating second instance
        st2.name ="Gu";
        st2.dummyCounter=2;

        ++st2.countryCounter;

        System.out.println("st1.countryCounter = " + st1.countryCounter );
        System.out.println("st2.countryCounter = " + st2.countryCounter);
        System.out.println("StaticPractice.countryCounter = " + StaticPractice.countryCounter);

    }
}
