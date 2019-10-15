package Lab6;

public class RecussiveFibonacci {
    public static void main(String[] args) {
        RecussiveFibonacci r = new RecussiveFibonacci();
        System.out.println(r.fib(10));
    }

    int fib(int n) {
        return innerFib(n - 1);
    }

    int innerFib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return innerFib(n - 1) + innerFib(n - 2);
    }
}
