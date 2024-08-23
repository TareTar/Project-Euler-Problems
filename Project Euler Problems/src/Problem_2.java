public class Problem_2
{
    public static int solve()
    {
        //Even Fibonacci Numbers
        int upperBound = 4000000;
        int sum = 0;
        int i_0 = 1;
        int i_1 = 1;

        while (i_1 <= upperBound)
        {
            int temp = i_1;
            i_1 += i_0;
            i_0 = temp;
            
            if (i_1 % 2 == 0)
            {
                sum += i_1;
            }
        }

        return sum;
    }
}