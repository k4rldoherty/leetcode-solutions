public class FibonacciRecursion {
    public static void main(String[] args) {
        int n = 50;
        System.out.println(fibonacciRecursion(n));
    }

    public static int fibonacciRecursion(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
}
