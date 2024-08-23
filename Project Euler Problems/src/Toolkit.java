import java.util.ArrayList;
import java.math.BigInteger;

public class Toolkit
{
    public static ArrayList<Integer> generatePrimes(long upperBound)
    {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        
        outer:
        for (int i = 3; i < upperBound + 1; i += 2)
        {
            int limit = (int) Math.sqrt(i);

            for (int prime : primes)
            {
                if (i % prime == 0)
                {
                    continue outer;
                }

                if (prime > limit)
                {
                    break;
                }
            }

            //System.out.println(i);
            primes.add(i);
        }

        return primes;
    }


    public static int[] generatePrimesList(int length)
    {
        int[] primes = new int[length];
        primes[0] = 2;
        int index = 1;

        outer:
        for (int i = 3; index < length; i += 2)
        {
            int limit = (int) Math.sqrt(i);
            
            for (int j = 0; j < index; j++)
            {
                if (i % primes[j] == 0)
                {
                    continue outer;
                }

                if (primes[j] > limit)
                {
                    break;
                }
            }

            System.out.println(i);
            primes[index] = i;
            index++;
        }

        return primes;
    }


    public static ArrayList<Integer> generatePrimeFactors(long upperBound)
    {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        factors.add(1);
       
        for (int i = 1; i <= upperBound; i++)
        {
            int temp = i;

            for (int factor : factors)
            {
                if (temp % factor == 0)
                {
                    temp /= factor;
                }
            }

            if (temp > 1)
            {
                factors.add(0, temp);  
            }
        }

        return factors;
    }


    public static ArrayList<Integer> primeFactors(long num)
    {
        ArrayList<Integer> primes = generatePrimes((long) Math.sqrt(num));
        ArrayList<Integer> factors = new ArrayList<Integer>();

        for (int prime : primes)
        {
            while (num % prime == 0)
            {
                factors.add(prime);
                num /= prime;
            }
        }

        return factors;
    }

    
    public static ArrayList<int[]> divisors(long num)
    {
        ArrayList<int[]> divisors = new ArrayList<int[]>();

        for (int i = 1; i < Math.sqrt(num) + 1; i++)
        {
            if (num % i == 0)
            {
                int[] pair = {i, (int) num / i};
                divisors.add(pair);
            }
        }

        return divisors;
    }


    public static boolean isPalindrome(int num)
    {
        ArrayList<Integer> digits = new ArrayList<Integer>();

        while (num > 1)
        {
            digits.add(num % 10);
            num /= 10;
        }

        for (int i = 0; i < digits.size() / 2; i++)
        {
            if (!digits.get(i).equals(digits.get(digits.size() - 1 - i)))
            { 
                return false;
            }
        }
        return true;
    }

    
    public static BigInteger factorial(int n)
    {
        if (n == 0)
        {
            return new BigInteger("1");
        }

        return factorial(n - 1).multiply(new BigInteger(Integer.toString(n)));
    }
}
