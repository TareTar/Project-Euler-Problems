public class Problem_4
{
    public static int solve()
    {
        //Largest Palindrome Product
        int upperBound = 1000;
        int greatestPalindrome = 1;

        for (int i = 1; i < upperBound; i++)
        {
            for (int j = 1; j < i; j++)
            {
                int product = i * j;
                if (Toolkit.isPalindrome(product))
                {
                    greatestPalindrome = Math.max(greatestPalindrome, product);
                }
            }
        }

        return greatestPalindrome;
    }
}
