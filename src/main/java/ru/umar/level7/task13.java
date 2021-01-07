package ru.umar.level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class task13 {
/*
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.

Требования:
Объяви переменную типа список строк и сразу проинициализируй ee.
Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
Должна быть выведена только одна строка.
 */


// алгоритм:
// 1) Узнать какой элемент самый длинный и самый короткий
// 2) Сравнить их индексы ячеек
// 3) Если индекс ячейки меньше и! размер строки больше или меньше вывести на экран

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }


        String max_size_value = list.get(0);
        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() > max_size_value.length()) {
                max_size_value = list.get(i);
            }
        }


        String min_size_value = list.get(0);
        for (int i = 0; i < 5; i++) {
            if (list.get(i).length() < min_size_value.length()) {
                min_size_value = list.get(i);
            }
        }
        if (list.indexOf(min_size_value) < list.indexOf(max_size_value)) {
            System.out.println(min_size_value);
        } else {
            System.out.println(max_size_value);
        }


    }

}
