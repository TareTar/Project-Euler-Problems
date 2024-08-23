public class Problem_5 
{
    public static int solve()
    {
        //Smallest Multiple
        int upperBound = 20;
        int num = 1;

        for (int factor : Toolkit.generatePrimeFactors(upperBound))
        {
            num *= factor;
        }

        return num;
    }
}
