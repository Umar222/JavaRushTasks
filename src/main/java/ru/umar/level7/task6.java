package ru.umar.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class task6 {

/*
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
    Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить,
    на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей."
    или "В домах с четными номерами проживает больше жителей."

Примечание:
дом с порядковым номером 0 считать четным.
Требования:
•	Программа должна создавать массив на 15 целых чисел.
•	Программа должна считывать числа для массива с клавиатуры.
•	Программа должна вывести сообщение "В домах с нечетными номерами проживает больше жителей.",
    если сумма нечетных элементов массива больше суммы четных.
•	Программа должна вывести сообщение "В домах с четными номерами проживает больше жителей.",
    если сумма четных элементов массива больше суммы нечетных.
 */

    public static void main(String[] args) throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int[] home = new int[6];

        for (int i = 0; i < 6; i++) {
            home[i] = Integer.parseInt(buffer.readLine());
        }

        int even_number = 0;
        int odd_number = 0;

        for (int i = 0; i < 6; i++){
            if (i % 2 == 0){

//                even_number += home[i];
//                System.out.println(home[i]);
                System.out.println(even_number += home[i]);

            } else {
//                odd_number += home[i];
//                System.out.println(odd_number += home[i]);
            }

        }

       if (even_number > odd_number) {
//           System.out.println("Четные числа " + even_number);
           System.out.println("В домах с четными номерами проживает больше жителей.");
       } else{
//           System.out.println("Не четные числа " + odd_number);
           System.out.println("В домах с нечетными номерами проживает больше жителей.");
       }

    }


}
