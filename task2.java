import java.util.Arrays;
import java.util.Random;

public class task2 {

    public static void main(String[] args) {
        int size = 10000; // You can adjust this size for performance comparison
        int[] array = generateRandomArray(size);

        // Copy the array for each sorting algorithm
        int[] arrayForBubbleSort = Arrays.copyOf(array, array.length);
        int[] arrayForSelectionSort = Arrays.copyOf(array, array.length);
        int[] arrayForInsertionSort = Arrays.copyOf(array, array.length);
        int[] arrayForQuickSort = Arrays.copyOf(array, array.length);

        long startTime, endTime;

        // Bubble Sort
        startTime = System.nanoTime();
        bubbleSort(arrayForBubbleSort);
        endTime = System.nanoTime();
        System.out.println("Bubble Sort Time: " + (endTime - startTime) + " ns");

        // Selection Sort
        startTime = System.nanoTime();
        selectionSort(arrayForSelectionSort);
        endTime = System.nanoTime();
        System.out.println("Selection Sort Time: " + (endTime - startTime) + " ns");

        // Insertion Sort
        startTime = System.nanoTime();
        insertionSort(arrayForInsertionSort);
        endTime = System.nanoTime();
        System.out.println("Insertion Sort Time: " + (endTime - startTime) + " ns");

        // Quick Sort
        startTime = System.nanoTime();
        quickSort(arrayForQuickSort, 0, arrayForQuickSort.length - 1);
        endTime = System.nanoTime();
        System.out.println("Quick Sort Time: " + (endTime - startTime) + " ns");
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10000); // Random numbers between 0 and 9999
        }
        return array;
    }

    // Bubble Sort
    private static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    private static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Insertion Sort
    private static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    // Quick Sort
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}
