package com.alex.d;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        bubble(array);
    }
    public static void bubble(int array []){  // https://www.youtube.com/watch?v=xli_FI7CuzA

        /** Сортировка пузырьком (Bubble Sort):
         Алгоритм проходит по списку многократно, сравнивая пары элементов и меняя их местами, если они стоят в неправильном порядке. */

        /*  (O(n^2)) квадратичная сложность  */
        System.out.println("Bubble sort Pass 0: "+ Arrays.toString(array));
        boolean isSorted = false;
        int temp;
        int pass = 0; // Добавляем переменную для отслеживания проходов
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            pass++;
            System.out.println("Bubble Sort Pass " + pass + ": " + Arrays.toString(array));
        }

        System.out.println("----------------------------------------------------------------------------");

    }
}
