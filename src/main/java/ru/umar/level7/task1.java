package ru.umar.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
    /*
    1. В методе initializeArray():
    1.1. Создай массив на 20 чисел
    1.2. Считай с консоли 20 чисел и заполни ими массив
    2. Метод max(int[] array) должен находить максимальное число из элементов массива

Требования:
•	Метод initializeArray должен создавать массив из 20 целых чисел.
•	Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
•	Метод max должен возвращать максимальный элемент из переданного массива.
•	Метод main изменять нельзя.
     */

    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);


    }

    public static int[] initializeArray() throws IOException {
        int[] list = new int[20];
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            list[i] = Integer.parseInt(buffer.readLine());
        }
        return list;
    }

    public static int max(int[] array) throws IOException {

        int max = array[0];
        for (int i = 0; i < 20; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
