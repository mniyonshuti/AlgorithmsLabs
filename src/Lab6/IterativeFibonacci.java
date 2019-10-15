package Lab6;

public class IterativeFibonacci {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    static int fib(int n){
        if(n == 0 )
            return 0;
        if(n == 1)
            return 1;
        else{
             n -= 2;
            int previousFibNumber = 0;
            int currentFibNumber = 1;
            while( n > 0){
                int temp = currentFibNumber;
                currentFibNumber = currentFibNumber + previousFibNumber;
                previousFibNumber = temp;
                n--;
            }
            return currentFibNumber;
        }
    }
}
