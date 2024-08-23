public class Problem_6
{
    public static int solve()
    {
        //Sum Square Difference
        int n = 100;

        return (int)Math.pow(n * (n + 1) / 2, 2) - n * (n + 1) * (2 * n + 1) / 6;
    }
}
