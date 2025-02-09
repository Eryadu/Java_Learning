package Array;

public class AvgUsingMethodDemo {
    public float avrage (int[] ages)
    {
    int len = ages.length;
    int sum =0;
    for(int i : ages)
    {
        sum += i;
    }

    float avg = sum/len;
     return avg;
    }
}
