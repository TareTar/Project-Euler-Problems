public class Problem_10
{
    public static long solve()
    {
        //Summation of Primes
        int upperBound = 2000000;
        long sum = 0;
        
        for (int prime : Toolkit.generatePrimes(upperBound))
        {
            sum += prime;
        }

        return sum;
    }    
}