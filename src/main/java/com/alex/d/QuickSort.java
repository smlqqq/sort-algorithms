package com.alex.d;

import java.util.Arrays;

class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        quickSort(array, 0, array.length - 1);
        System.out.println("Quick sort = " + Arrays.toString(array));
    }
 public static void quickSort(int[] array, int low, int high) {
    /* временной сложностью в среднем O(n log n), что делает его эффективным для больших массивов данных. */
       
    if (low < high) {
            int partitionIndex = partition(array, low, high);

            // Рекурсивно сортируем элементы до и после разделителя
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                // Обмен элементов array[i] и array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Обмен элементов array[i + 1] и array[high] (разделитель)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
    
}