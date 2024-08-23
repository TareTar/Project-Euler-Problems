import java.math.BigInteger;

public class Problem_15 
{
    public static BigInteger solve()
    {
        //Lattice Paths
        return Toolkit.factorial(40).divide(Toolkit.factorial(20)).divide(Toolkit.factorial(20));
    }
}
