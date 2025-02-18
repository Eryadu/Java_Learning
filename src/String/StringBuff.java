package String;

public class StringBuff {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Pragra"); // StringBuffer
        System.out.println(sb);
        sb.append(" Company");
        System.out.println(sb);

        StringBuilder str = new StringBuilder("Laptop"); // StringBuilder
        str.append(" Dell");
        System.out.println(str);
        System.out.println(str.reverse());


    }
}
