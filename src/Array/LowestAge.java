package Array;

public class LowestAge {
    public static void main(String[] args) {


        int[] age = {10, 20, 30, 40, 15, 35, 12};
        int lowest = age[0];

        for (int i : age) {
            if(lowest>i)
            {
                lowest =i;
            }
        }
        System.out.println("Lowest age is  = " + lowest);
    }
}