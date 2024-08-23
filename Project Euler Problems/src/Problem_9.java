public class Problem_9
{
    public static int solve()
    {
        //Special Pythagorean Triplet
        int sum = 1000;
        
        for (int[] divisor : Toolkit.divisors(sum / 2))
        {
            int x = divisor[0];
            int y = divisor[1] - x;

            int a = 2 * x * y;
            int b = x * x - y * y;
            int c = x * x + y * y;

            if (a > 0 && b > 0 && c > 0)
            {
                return a * b * c;
            }
        }

        return -1;
    }
}