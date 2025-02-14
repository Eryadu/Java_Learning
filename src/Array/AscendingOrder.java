package Array;

public class AscendingOrder {
    public static void main(String[] args) {

        int[] ascNum = new int[] { 3,2,5,4,8,6,12,5};

        System.out.print("Elements of Array are : ");
        for (int i : ascNum)
        {
            System.out.print("  " +i + " ");
        }
        int temp = 0;
        for (int i=0; i< ascNum.length; i++)
        {
            for (int j = i+1; j< ascNum.length;j++)
            {
                if(ascNum[i]>ascNum[j]) {
                    temp = ascNum[i];
                    ascNum[i] = ascNum[j];
                    ascNum[j] = temp;
                }

            }
        }
        System.out.println( "Array Elements in Ascending Order : ");
        for (int i=0 ; i< ascNum.length-1;i++)
        {
            System.out.println(ascNum[i] + ',');
        }
        System.out.println(ascNum[ascNum.length-1]);
    }
}
