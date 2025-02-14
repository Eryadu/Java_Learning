package Array;

public class DuplicateElement {
    public static void main(String[] args) {

        int[] dupNum = new int[] {2,2,3,4,5,3,5,6};
        System.out.println("Arrays Elements :");

        for(int i=0; i< dupNum.length; i++)
        {
            for(int j=i+1; j< dupNum.length; j++)
            {
                if (dupNum[i]==dupNum[j])
                {
                    System.out.println(dupNum[j]);
                }

            }
        }
    }
}
