import java.math.BigInteger;

public class Problem_16 
{
    public static int solve()
    {
        //Power Digit Sum
        BigInteger number = BigInteger.TWO.pow(1000);
        int sum = 0;

        for (char digit : number.toString().toCharArray())
        {
            sum += Character.getNumericValue(digit);
        }

        return sum;
    }
}