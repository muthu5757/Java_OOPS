public class task3 {

    public static void main(String[] args) {
        // Test cases
        int[] testValues = {5, 10, 20, 30, 40}; // Change or add more test cases as needed

        for (int n : testValues) {
            long startTime = System.nanoTime();
            long result = fibonacci(n);
            long endTime = System.nanoTime();
            System.out.println("Fibonacci(" + n + ") = " + result);
            System.out.println("Calculation Time: " + (endTime - startTime) + " ns");
        }
    }

    // Recursive function to calculate Fibonacci number
    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
