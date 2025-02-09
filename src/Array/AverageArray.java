package Array;

public class AverageArray {
    public static void main(String[] args) {
        int[] ages = {10,20,30,40,50,60,70,80,90,100};
        int length = ages.length;
        int sum =0;
        for (int i : ages)
        {
            sum += i; // calculate sum
        }

        float avg = sum/length;
        System.out.println("Average is = " + avg);

    }
}
