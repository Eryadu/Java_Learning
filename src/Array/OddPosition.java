package Array;

public class OddPosition {
    public static void main(String[] args) {
         int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Array Elements on odd Positions: ");
        for(int i =0; i< num.length; i=i+2) // increment by 2 instead of 1 to print odd position
        {
            System.out.println(num[i]);
        }

    }
}
