package Lab8;

public class IsPrime {
    public static void main(String[] args) {
        IsPrime isPrime = new IsPrime();
        System.out.println(isPrime.isPrime(461));
    }

    boolean isPrime(int n) {
        if (n < 2)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        else {
            double nums = Math.sqrt(n);
            int i = (int) Math.ceil(nums);
            int j = 3;
            while (j <= i) {
                if (n % j == 0)
                    return false;
                j++;

            }
        }
        return true;
    }
}
