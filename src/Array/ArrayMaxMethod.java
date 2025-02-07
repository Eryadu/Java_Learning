package Array;

public class ArrayMaxMethod {

    public int findMaxElement(int[] arr){
        System.out.println("max Element is below :");

        int max = arr[0]; // declare variable to compare with array element
        // find the max element of given array

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

           // System.out.println("Max1 is : " + max); // if use void type ij method instead of int.
        }
        return max;
    }
}
