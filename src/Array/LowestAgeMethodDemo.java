package Array;

public class LowestAgeMethodDemo {
    public int lowestAge (int[] ages)
    {
        int low = ages[0]; // assign first element of array to compare
        for (int i : ages)
        {
            if(low>i)
            {
                low=i; // if condition true assign the lowest number to variable low
            }

        }return  low; // return the value of low
    }
}
