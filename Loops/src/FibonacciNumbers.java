public class FibonacciNumbers {
    static int generateFibonacci(int n) {
        if(n == 0 || n == 1) return 1;
        return generateFibonacci(n - 1) + generateFibonacci(n - 2);
    }

    public static int fibonacci(int n) {
        int res = generateFibonacci(n - 1);
        return res;
    }
}
