public class Problem_12
{
    public static long solve()
    {
        //Highly Divisible Triangular Number
        long value = 0;

        for (int i = 1; true; i++)
        {
            value += i;
            if (Toolkit.divisors(value).size() * 2 > 500)
            {
                return value;
            }
        }
    }
}
