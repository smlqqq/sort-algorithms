package com.alex.d;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        insertionSort(array);
    }

    public static void insertionSort(int[] array) { // https://www.youtube.com/watch?v=JU767SDMDvA

        /** Сортировка вставками (Insertion Sort) Шелла :
         Алгоритм поочередно берет каждый элемент и вставляет его на правильное место в уже отсортированной части списка. */

        /*  (O(n^2)) квадратичная сложность, но в лучшем случае (если массив уже отсортирован), может быть близкой к O(n) */
        System.out.println("Insertion sort Pass 0: "+ Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;

            while (j > 0 && array[j - 1] > current) {
                array[j] = array[j - 1];
                j--;
            }

            array[j] = current;

            // Выводим текущее состояние массива после каждого прохода
            System.out.println("Insertion Sort Pass " + i + ": " + Arrays.toString(array));
        }

        System.out.println("----------------------------------------------------------------------------");

    }
}
