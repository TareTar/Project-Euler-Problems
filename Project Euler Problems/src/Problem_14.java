public class Problem_14
{
    public static int solve()
    {
        //Longest Collatz Sequence
        double maxChain = 0;
        int maxIndex = 0;

        for (int i = 0; i <= 1E6; i++)
        {
            double n = i;
            double chain = 0;

            while (n > 1)
            {
                if (n % 2 == 0)
                {
                    n /= 2;
                }
                else
                {
                    n = n * 3 + 1;
                }

                chain++;
            }

            if (chain > maxChain)
            {
                maxChain = chain;
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}