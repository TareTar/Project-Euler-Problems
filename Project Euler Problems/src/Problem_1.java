public class Problem_1
{   
    public static int solve()
    {
        //Multiples of 3 or 5
        int upperBound = 1000;
        int sum = 0;

        for (int i = 1; i < upperBound; i++)
        {
            if (i % 3 == 0 || i % 5 == 0)
            {
                sum += i;
            }
        }

        return sum;
    }
}