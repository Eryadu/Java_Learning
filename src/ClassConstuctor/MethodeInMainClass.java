package ClassConstuctor;

public class MethodeInMainClass {
    public static void main(String[] args) {
        mymethode();
    }

    static void mymethode() // static is used casue it belong to main class, not an object
           // to main class
    {
        System.out.println("I am Testing methode in main class without creating objects");
    }
}
