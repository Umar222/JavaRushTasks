package ru.umar.level7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class task12 {
/*
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Программа должна считывать 5 строк с клавиатуры.
•	Удали последнюю строку и вставь её в начало. Повторить 13 раз.
•	Программа должна выводить список на экран, каждое значение с новой строки
 */

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>(5);
        for (int i = 0; i < 5; i++){
            list.add(reader.readLine());
        }

        String value;
        for (int i = 0; i < 13; i ++){
            value = list.get(4);
            list.remove(4);
            list.add(0, value);
        }
        for (String s: list
             ) {
            System.out.println(s);
        }

    }
}
