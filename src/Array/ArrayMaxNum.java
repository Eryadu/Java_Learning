package Array;

import java.util.Arrays;

public class ArrayMaxNum {
    public static void main(String[] args) {
        int[] num = {100, 120, 300, 40, 50, 160, 370, 180, 190};
        int max = num[0];
// find the max element of given array
        //System.out.println(Arrays.stream(num).max());
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Max is : " + max);
    }
}
