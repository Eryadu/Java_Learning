package Array;

public class CopyElements {
    public static void main(String[] args) {
        int[] firstArray = new int[] {1,2,3,4,5,6,7};

        System.out.println("Print the elements of first Array : ");
        for (int i =0; i< firstArray.length; i++)
        {
            System.out.println(firstArray[i]);
        }

        System.out.println("Copy the elements of first Array to second Array :");
        int[] secondArray = new int[firstArray.length];
        for (int i = 0; i < firstArray.length; i++) // Copy elements of first Array
        {
           secondArray[i] = firstArray[i];
        }

        for(int i : secondArray) // Print second Array
        {
            System.out.println(i);
        }
    }
}
