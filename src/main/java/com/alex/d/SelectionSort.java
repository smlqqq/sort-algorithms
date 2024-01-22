package com.alex.d;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        selectionSort(array);
    }

    public static void selectionSort(int[] array) {    // https://www.youtube.com/watch?v=g-PGLbMth_g

        /** Сортировка выбором (Selection Sort):
         Алгоритм ищет минимальный элемент из оставшихся и обменивает его с первым элементом в списке. */

        /* сортировка выбором имеет квадратичную временную сложность O(n^2), и она может быть неэффективной для больших массивов. */

        System.out.println("Selection sort Pass 0: "+ Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) { // Внешний цикл проходит по всем элементам массива, кроме последнего (array.length - 1), так как последний элемент будет отсортирован после всех предыдущих.

            // Находим индекс минимального элемента в подмассиве
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) { // Внутренний цикл ищет минимальный элемент в оставшейся части массива, начиная с позиции i + 1.
                if (array[j] < array[minIndex]) {  // Если найден элемент меньше текущего минимального, обновляем индекс минимального элемента.
                    minIndex = j;
                }
            }
            // Обмен минимального элемента с текущим
            int temp = array[minIndex];
            array[minIndex] = array[i]; // После завершения внутреннего цикла, обмениваем минимальный элемент с текущим элементом на позиции i.
            array[i] = temp;

            System.out.println("Selection Sort Pass " + (i + 1) + ": " + Arrays.toString(array));
        }

        System.out.println("----------------------------------------------------------------------------");

    }
}
