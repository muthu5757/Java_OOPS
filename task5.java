public class task5 {
    public static void main(String[] args) {
        int n = 10; // Example: calculate the 10th Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
