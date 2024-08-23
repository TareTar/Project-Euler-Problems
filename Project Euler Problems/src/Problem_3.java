public class Problem_3
{
    public static int solve()
    {
        //Largest Prime Factor
        long number = 600851475143L;
        long upperBound = (long) Math.sqrt(number);
        
        int greatestPrimeFactor = 1;

        for (int prime : Toolkit.generatePrimes(upperBound))
        {
            if (number % prime == 0)
            {
                greatestPrimeFactor = Math.max(greatestPrimeFactor, prime);
            }
        }

        return greatestPrimeFactor;
    }
}