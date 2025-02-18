package String;

public class StringMethod {
    public static void main(String[] args) {

        String s = "PRAGRA";

        System.out.println(s.toLowerCase()); // to print lower case
        System.out.println(s.length()); // to print length
        System.out.println(s.charAt(1)); // print index of string
        char[] chars = s.toCharArray(); // to convert string to array
        System.out.println(chars);
        String concat = s.concat(" Company");
        System.out.println(concat);

        String s1 = "      Pragra       ";
        String s2 = "Pragra";
        System.out.println(s1.trim()); // it remove all the spaces from both sides
        System.out.println(s.compareTo(s2)); // to compare two strings lexicographically


    }
}
